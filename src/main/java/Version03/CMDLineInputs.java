package Version03;

public class CMDLineInputs implements Inputs {

    private String[] arguments;
    public CMDLineInputs(String args[]){
        this.arguments = args;
    }

    @Override
    public String read() {
        return arguments[0];

        /*String operation = arguments[0];
        return arguments[0];
         */
    }

}
