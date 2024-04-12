public class testStackOfIntegers {

    public static void main(String[] args) {

        stackOfIntegers stack = new stackOfIntegers();

        for(int i=0; i<10; i++) {
            stack.push(1);
        }

        while(!stack.empty())
            System.out.print(stack.pop()+" ");

    }

}