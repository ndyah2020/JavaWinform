package Control;

import BUS.LoaiMayBayBus;
import BUS.MayBayBUS;
import DTO.LoaiMayBayDTO;
import DTO.MayBayDTO;
import GUI.forms.MayBayControlForm;
import GUI.forms.MayBayPanelForm;
import GUI.forms.MayBayTableForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MayBayController {
    private ArrayList<MayBayDTO> dsMayBay;
    private final MayBayTableForm panelMayBayTable;
    private final MayBayControlForm panelMayBayControl;
    private final MayBayBUS mayBayBUS = new MayBayBUS();
    private String popupModel = "";
    
    public MayBayController(MayBayPanelForm panelForm) {
        this.panelMayBayTable = panelForm.getMayBayTableForm();
        this.panelMayBayControl = panelForm.getMayBayControlForm();
        
        panelMayBayControl.getTxtGetMaLoaiMayBay().setEditable(false);
    }
    
    private void taiDuLieuLenBang(DefaultTableModel model, ArrayList<MayBayDTO> danhSachMayBay) {
        model.setRowCount(0);
        for(MayBayDTO mb : danhSachMayBay) {
            Vector row = new Vector();
            row.add(mb.getMaMayBay());
            row.add(mb.getTenMayBay());
            row.add(mb.getSoLuongGheThuong());
            row.add(mb.getSoLuongGheVip());
            row.add(mb.getTongSoLuongGhe());
            row.add(mb.getMaLoaiMayBay());
            model.addRow(row);
        }
    }
    
    private void setModeLoaiMayBay(DefaultTableModel model, ArrayList<LoaiMayBayDTO> danhSachMayBay) {
        model.setRowCount(0);
        for (LoaiMayBayDTO lmb : danhSachMayBay) {
            Vector<String> row = new Vector<>();
            row.add(lmb.getMaLoai());
            row.add(lmb.getTenLoai());
            model.addRow(row);
        }
    }
    
    private void layDanhSachLoaiMayBayVaHienThiLenPopup() {
        String[] tenCot = {"Mã loại", "Tên loại"};
        panelMayBayControl.getBangLayMaLoaiMayBay().setcolumnDefaultTableModel(tenCot);
        DefaultTableModel model = panelMayBayControl.getBangLayMaLoaiMayBay().getModel();
        LoaiMayBayBus lmbBUS = new LoaiMayBayBus();
        ArrayList<LoaiMayBayDTO> daLoaiMayBay = lmbBUS.getDanhSachLoaiMayBay();
        setModeLoaiMayBay(model, daLoaiMayBay);
        panelMayBayControl.getBangLayMaLoaiMayBay().getMyTable().setModel(model);
    }
    
    private MayBayDTO layMotMayBay(String maMayBay) {
        for(MayBayDTO mb : dsMayBay) {
            if (mb.getMaMayBay().equals(maMayBay)) {
                return mb;
            }
        }
        return null;
    }
    
    private void setForm(MayBayDTO mb) {
        panelMayBayControl.getTxtMaMayBay().setText(mb.getMaMayBay());
        panelMayBayControl.getTxtTenMayBay().setText(mb.getTenMayBay());
        panelMayBayControl.getTxtSoLuongGheThuong().setText(String.valueOf(mb.getSoLuongGheThuong()));
        panelMayBayControl.getTxtSoLuongGheVip().setText(String.valueOf(mb.getSoLuongGheVip()));
        panelMayBayControl.getTxtGetMaLoaiMayBay().setText(mb.getMaLoaiMayBay());
    }
    
    public void hienThiDanhSachMayBay() {
        DefaultTableModel model = panelMayBayTable.getModel();
        dsMayBay = mayBayBUS.getDanhSachMayBayBUS();
        taiDuLieuLenBang(model, dsMayBay);
        panelMayBayTable.getMyTable().setModel(model);
    }
    
    public ArrayList<MayBayDTO> danhSachTimTheoTen(String tuKhoa) {
        ArrayList<MayBayDTO> ketQua = new ArrayList<>();
        for (MayBayDTO mb : dsMayBay) {
            if (mb.getTenMayBay().toLowerCase().contains(tuKhoa.toLowerCase())) {
                ketQua.add(mb);
            }
        }
        return ketQua;
    }
    
    public void xuLySuKienMayBayControl() {
        panelMayBayTable.addRowClick(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                int row = panelMayBayTable.getMyTable().getSelectedRow();
                if(row != -1) {
                    String maMayBay = panelMayBayTable.getMyTable().getValueAt(row, 0).toString();
                    MayBayDTO mb = layMotMayBay(maMayBay);
                    if(mb != null) {
                        setForm(mb);
                    }
                }
            }
        });
        
        panelMayBayControl.addThemListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String maMayBay = panelMayBayControl.getTxtMaMayBay().getText().trim();
                    String tenMayBay = panelMayBayControl.getTxtTenMayBay().getText().trim();
                    int gheThuong = Integer.parseInt(panelMayBayControl.getTxtSoLuongGheThuong().getText().trim());
                    int gheVip = Integer.parseInt(panelMayBayControl.getTxtSoLuongGheVip().getText().trim());
                    String maLoai = panelMayBayControl.getTxtGetMaLoaiMayBay().getText().trim();

                    if (maMayBay.isEmpty() || tenMayBay.isEmpty() || maLoai.isEmpty() || gheThuong < 0 || gheVip < 0) {
                        JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!");
                        return;
                    }

                    MayBayDTO mb = new MayBayDTO();
                    mb.setMaMayBay(maMayBay);
                    mb.setTenMayBay(tenMayBay);
                    mb.setSoLuongGheThuong(gheThuong);
                    mb.setSoLuongGheVip(gheVip);
                    mb.setTongSoLuongGhe(gheThuong + gheVip);
                    mb.setMaLoaiMayBay(maLoai);

                    mayBayBUS.themMayBayBUS(mb);
                    panelMayBayControl.resetForm();
                    hienThiDanhSachMayBay();
                    JOptionPane.showMessageDialog(null, "Thêm máy bay thành công!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Lỗi nhập dữ liệu!" + e.getMessage());
                }  
        }
        });
        
        panelMayBayControl.addXoaListenner(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int row = panelMayBayTable.getMyTable().getSelectedRow();
                if (row != -1) {
                    String maMayBay = panelMayBayTable.getMyTable().getValueAt(row, 0).toString();
                    mayBayBUS.xoaMayBay(maMayBay);
                    panelMayBayControl.resetForm();
                    hienThiDanhSachMayBay();
                    JOptionPane.showMessageDialog(null, "Xóa thành công!");
                 }
            }
        });
        
        panelMayBayControl.addSuaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int row = panelMayBayTable.getMyTable().getSelectedRow();
                if (row != -1) {
                    try {
                        String maMayBay = panelMayBayControl.getTxtMaMayBay().getText().trim(); 
                        String tenMayBay = panelMayBayControl.getTxtTenMayBay().getText().trim();
                        int gheThuong = Integer.parseInt(panelMayBayControl.getTxtSoLuongGheThuong().getText().trim());
                        int gheVip = Integer.parseInt(panelMayBayControl.getTxtSoLuongGheVip().getText().trim());
                        String maLoai = panelMayBayControl.getTxtGetMaLoaiMayBay().getText().trim();
                        
                        MayBayDTO mb = new MayBayDTO();
                        mb.setMaMayBay(maMayBay);
                        mb.setTenMayBay(tenMayBay);
                        mb.setSoLuongGheThuong(gheThuong);
                        mb.setSoLuongGheVip(gheVip);
                        mb.setTongSoLuongGhe(gheThuong + gheVip);
                        mb.setMaLoaiMayBay(maLoai);
                        
                        mayBayBUS.suaMayBayBUS(mb);
                        panelMayBayControl.resetForm();
                        hienThiDanhSachMayBay();
                        JOptionPane.showMessageDialog(null, "Cập nhật máy bay thành công!");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Lỗi nhập dữ liệu! " + e.getMessage());
                    }
                }
            }
        });
        
        panelMayBayControl.addTimKiemListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                String tuKhoa = panelMayBayControl.getTxtTimKiem().getText().trim();
                DefaultTableModel model = panelMayBayTable.getModel();
                if(!tuKhoa.isEmpty()) {
                    taiDuLieuLenBang(model, danhSachTimTheoTen(tuKhoa));
                } else {
                    hienThiDanhSachMayBay();
                }
            }
        });
        
        panelMayBayControl.addShowPopupGetMaLoaiMayBay(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelMayBayControl.getTxtGetMaLoaiMayBay().setText("");
                panelMayBayControl.showPopupGetMaLoaiMayBay();
                layDanhSachLoaiMayBayVaHienThiLenPopup();
            }
        });
        
        panelMayBayControl.getBangLayMaLoaiMayBay().addRowClickPopup(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                String maLoaiPopup = panelMayBayControl.getBangLayMaLoaiMayBay()
                        .getMyTable()
                        .getValueAt(panelMayBayControl.getBangLayMaLoaiMayBay().getMyTable().getSelectedRow(), 0)
                        .toString();
                panelMayBayControl.getTxtGetMaLoaiMayBay().setText(maLoaiPopup);
            }
        });
    }
}


