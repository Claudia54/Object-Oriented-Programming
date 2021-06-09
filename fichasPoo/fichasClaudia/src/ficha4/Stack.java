public class Stack{
    private ArrayList <String> ele;
    

    public  Stack(){
        this.ele=new ArrayList<String>();
    }
    public void Stack(ArrayList<string>ele){
       this.ele=ele;
    }

    public Stack(Stack stack){
        this.ele=stack.getEle();
    }

    public ArrayList<String> getEle() {
        return ele;
    }

    public void setEle(ArrayList<String> ele) {
        this.ele = ele;
    }
    public Stack clone(){
        return new Stack(this);
    }
    public String top(){
        if (!this.ele.isEmpty()){
        int n = ele.size();
        return ele.get(n-1);
        }
        else return null;
    }
    public void push(String s){
        this.ele.add(s);
    }
    public void pop(){
        if (!this.ele.isEmpty()){
            int n = ele.size()-1;
            this.ele.remove(n);
        }
        else return null;

    }
    public boolean empty(){
        return this.ele.isEmpty();
        }

    public int length(){
        n= this.ele.size();
        return n;
    }
    public String toString() {
        StringBuffer sb =new StringBuffer("Stack de Strings\n");
        sb.appemnd("Stack:" + this.ele.toString());
        return sb.toString();
    }



    }
