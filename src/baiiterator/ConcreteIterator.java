/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiiterator;

/**
 *
 * @author minht
 */
public class ConcreteIterator implements Iterator{

ConcreteAggregate aggregate;

//vị trí hiện tại của biến
int currentIndex;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

   

  
   

   

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object Next() {
        //Nếu done = false
        if (!isDone())
        {
            currentIndex++;
            return aggregate.GetItem(currentIndex);
        }
        return null;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object First() {
        currentIndex=0;
        return aggregate.GetItem(currentIndex);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    //Kiểm tra xem đã duyệt toàn bộ mảng hay chưa
    public boolean isDone() {
        if (currentIndex == aggregate.Count())
        {
            return true;
            //XÁc nhận đã in hết, dừng hẳn thằng Object next
        }
        return false;
        //Hàm next có thể làm tiếp
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public Object CurrentItem() {
//       // return  aggregate.GetItem(currentIndex);
//        return null;
//     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

  
    
}
