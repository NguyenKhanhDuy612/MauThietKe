/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreationalPattern.Bai2_BuilderPattern;

/**
 *
 * @author Admin
 */
public class MyStringBuilder {

    String str, s;
    double f;
    boolean b;

    public MyStringBuilder(Builder builder) {
        this.str = builder.str;
        this.s = builder.s;
        this.f = builder.f;
        this.b = builder.b;
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" + "str=" + str  + '}';
    }

    public static class Builder {

        String str, s;
        double f;
        boolean b;

        public Builder addString(String str, String s) {
            this.str = str + s;
            return this;
        }

        public Builder addFloat(float f) {
            this.str = str + f;
            return this;
        }

        public Builder addBool(boolean b) {
            this.str = str + b;
            return this;
        }

        

        public MyStringBuilder builder() {
            return new MyStringBuilder(this);
        }

        
    }
}
