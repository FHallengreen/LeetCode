package FredStackAndQueue;

public class StackAndQueue {

    public static void main(String[] args) {
        //Stack tests
        System.out.println("STACK TESTS");
        FredeStack fs = new FredeStack();

        if (fs.empty()) {
            System.out.println("Empty virker");
        }

        fs.push(0);
        fs.push(1);
        fs.push(0);
        fs.push(0);
        fs.push(3);
        fs.push(4);
        if (fs.size() == 6) {
            System.out.println("Size virker");
        } else {
            System.out.println("Size virker ikke");
        }
        int popped = fs.pop();
        if (popped == 4) {
            System.out.println("pop virker");
        }

        int top = fs.pop();
        if (top == 3) {
            System.out.println("top metoden virker");
        }

        if (!fs.empty()) {
            System.out.println("Empty virker også her");
        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("QUEUE TESTS");
        //Queue tests
        FredeQueue fq = new FredeQueue();

        if (fq.empty()) {
            System.out.println("Empty virker");
        }
        fq.push(0);
        fq.push(4);
        fq.push(4);
        fq.push(0);
        fq.push(3);
        if (fq.size() == 5) {
            System.out.println("Size virker");
        } else {
            System.out.println("Size virker ikke");
        }

        int poppedque = fq.pop();
        int poppedqu2 = fq.pop();

        if (poppedque == 0 && poppedqu2 == 4) {
            System.out.println("pop virker que");
        }

        if (!fq.empty()) {
            System.out.println("Empty virker også her");
        }


        //De her 2 loops må ikke crashe dig
        for (int i = 0; i < 1000; i++) {
            fs.push(i);
            int poppedx = fs.pop();
            //System.out.println(poppedx);
        }

        for (int i = 0; i < 1000; i++) {
            fq.push(i);
            int poppedx = fq.pop();
            //System.out.println(poppedx);
        }
    }
}

//Denne klasse skal implementeres, men du må ikke implementere andre "data strukture". Dvs du SKAL bruge arrayet
class FredeStack {

    //Du må gerne tilføje flere ting her, men ikke flere arrays/lister/queues eller lign
    //Dvs du må bruges Strings, ints hvis du får lyst
    int[] arr = new int[100];
    int size = 0;


    public void push(int x) {
        for (int i = size; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = x;
                size++;
                break;
            }
        }

    }

    public int pop() {
        for (int i = size; i > 0; i--) {
            if (arr[i] != 0) {
                size--;
                int temp = arr[i];
                arr[i] = 0;
                return temp;
            }
        }
        return 0;
    }

    public int top() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

}

//Denne klasse skal implementeres, men du må ikke implementere andre "data strukture". Dvs du SKAL bruge arrayet
class FredeQueue {
    //Du må gerne tilføje flere ting her, men ikke flere arrays/lister/queues eller lign
    //Dvs du må bruges Strings, ints hvis du får lyst
    int[] arr = new int[100];
    int size = 0;
    int position = 0;
    int popPosition = 0;

    //TODO
    public void push(int x) {
        if (position == arr.length || size == arr.length) {
            position = 0;
        }
        arr[position] = x;
        size++;
        position++;
    }

    //TODO
    public int pop() {
        if (popPosition == 100) {
            popPosition = 0;
        }
        size--;
        int temp = arr[popPosition];
        arr[popPosition] = 0;
        popPosition++;
        return temp;
    }

    //TODO
    public boolean empty() {
        return size == 0;
    }

    //TODO
    public int size() {
        return size;
    }

}