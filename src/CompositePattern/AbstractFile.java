/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompositePattern;

/**
 *
 * @author Admin
 */
public abstract class AbstractFile {
    //Chú ý Abstract fille của lớp cha abstract mà đã có contructor riêng rồi thì các lớp kế thừa nó contructor mặc định
    //của chúng nó sẽ bị hủy luôn, nên các lớp con phải tạo constructor
    String name, ngayTao;
    String duongDan;
    String preStr = ""; //cái kí tự thụt dòng

    public AbstractFile(String name, String ngayTao) {
        this.name = name;
        this.ngayTao = ngayTao;
        this.duongDan = name;  //Đường dẫn của file chính là filename
    }

    //add hoặc remove file trong folder, riêng cái file thì để trống 2 cái add foler
    //thì nên cần nhận một đối tượng con là file của absstractfile
    abstract void add(AbstractFile file);

    abstract void remove(AbstractFile file);

    abstract String getStringTreeFolder();

    //Chỉ dành cho file hiển thị ra đường dẫn
    public String getDuongDan() {
        return duongDan;
    }
}
