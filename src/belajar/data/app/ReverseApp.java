package belajar.data.app;
import belajar.data.utils.Stack;
public class ReverseApp {
    public static void main(String[] args) {
        String nama = "muhammad hanif";

        Stack stack = new Stack(nama);
        stack.pushArr();
        stack.popArr();
        System.out.println(stack.getOutput());
    }
}

