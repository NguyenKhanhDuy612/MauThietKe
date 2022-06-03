/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Folder extends AbstractFile{
    List<AbstractFile> list = new ArrayList<>();
    String thien;
    

    public Folder(String name, String ngayTao) {
        super(name, ngayTao);
    }
    

    @Override
    void add(AbstractFile file) {
        //KT xem các file hoặc thư mục cùng cấp có trùng tên hay khôgn
        //Chú ý tên file cũng chính là đường dẫn (trong absctrat file)
        if (!list.contains(file))
        {
            list.add(file);
            //đường dẫn file chính là có tên file nó luôn
            file.duongDan = this.duongDan + '\\' + file.duongDan;
        }
    }

    @Override
    void remove(AbstractFile file) {
        if (list.contains(file))
        {
            list.remove(file);
            return; //Có return là kết thúc hàm đó, dừng không cho chạy for phía dưới
        }
        //Nếu if không làm được (return chưa kết thúc)
        for (AbstractFile folder : list)
            folder.remove(file);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
     String getStringTreeFolder() {
         //Dùng stringbuilder kết hợp với append để cộng dồn thêm kí tự và append("/n") để xuống hàng
        StringBuilder builder = new StringBuilder();
         //Thêm tên root
         builder.append(preStr)
                  .append(name);
        
        for (AbstractFile f : list)  //f đại diện cho folder (ghép các thư mục con vào)
        {
            
            f.preStr = this.preStr + "..";
            builder.append("\n")
                    .append(f.getStringTreeFolder());
            
            f.preStr = ""; //Reset lại preStr
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return builder.toString();
    }
}
