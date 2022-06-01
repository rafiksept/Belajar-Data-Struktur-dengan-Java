package belajar.data.app;

import belajar.data.utils.QueueUtil;
import belajar.data.utils.UpdateArr;

public class QueueApp {
    public static void main(String[] args) {

        String[] inputAntrian = {
                "A", "B", "C", "D", "E" , "F", "G"
        };
        QueueUtil antrian = new QueueUtil(inputAntrian, 2);
        antrian.queue();
        antrian.dequeue();
    }
}
