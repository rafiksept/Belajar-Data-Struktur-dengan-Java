package belajar.data.utils;

public class Stack {
    private String[] stackArray;
    private String namaInput;
    private String[] reverseArr;

    public Stack(String namaInput){
        this.namaInput = namaInput;
    }

    public String[] getStackArray() {
        return stackArray;
    }

    public String getNamaInput() {
        return namaInput;
    }

    public void setNamaInput(String namaInput) {
        this.namaInput = namaInput;
    }

    public String[] getReverseArr() {
        return reverseArr;
    }

    public String[] pushArr(){
        this.stackArray = this.namaInput.split("");
        return this.stackArray;
    }

    public boolean popArr(){
        if (this.stackArray != null){
            this.reverseArr = new String[this.stackArray.length];
            for (var i = 0; i < this.stackArray.length; i++){
                this.reverseArr[i] = this.stackArray[this.stackArray.length - (i + 1)];

            }
            return true;
        } else {
            System.out.println("push belum di panggil!");
            return false;
        }
    }

    public String getOutput(){

        if(this.reverseArr != null){
            String output = "";
            for(var i : this.reverseArr){
                output += i;
            }
            return output;
        } else {
            return "maaf anda belum melakukan push dan pop";
        }

    }
}
