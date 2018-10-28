public class FormatExp {

    public String formatExp(String exp){


        int len = exp.length();

        if(len >= 3)
        {
            StringBuffer buf = new StringBuffer();
            buf.append(exp.substring(0,2));
            buf.append("/");
            buf.append(exp.substring(2));

            exp = buf.toString();
        }

        return exp;
    }

}
