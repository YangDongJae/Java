class StringStack implements Stack {
    private String arr[];
    private int top;
    public StringStack(int num) {
        arr = new String[num];
        top = 0;
    }

    @Override
    public int length() {
        return top;
    }

    @Override
    public int capacity() {
        return arr.length;
    }

    @Override
    public String pop() {
        if(top==0)
            return "비어있음";
        else {
            String str = arr[top-1];
            top--;
            return str;
        }
    }

    @Override
    public boolean push(String val) {
        if(top == arr.length)
            return false;
        else {
            arr[top] = val;
            top++;
            return true;
        }
    }
}

