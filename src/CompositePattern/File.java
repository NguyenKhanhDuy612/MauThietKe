/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompositePattern;

/**
 *
 * @author Admin
 */
public class File extends AbstractFile{
    //Chú ý Abstract fille của lớp cha abstract mà đã có contructor riêng rồi thì các lớp kế thừa nó contructor mặc định
    //của chúng nó sẽ bị hủy luôn, nên các lớp con phải tạo constructor

    
    //File chỉ có mỗi lấy tên file mà thôi,file không tự 
    public File(String name, String ngayTao) {
        super(name, ngayTao);
    }
    

    @Override
    void add(AbstractFile file) {
        
    }

    @Override
    void remove(AbstractFile file) {
     
    }

    @Override
    String getStringTreeFolder() {
      //  return this.preStr + name;
      return this.preStr + name;
    }

}
