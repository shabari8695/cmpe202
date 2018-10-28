public class FormatNumber {

    public String formatNumber(String number){

        int len = number.length();
        StringBuffer buf = new StringBuffer();

        if( len >= 5 )
        {
            buf.append(number.substring(0,4));
            buf.append(" ");
            buf.append(number.substring(4));


            number = buf.toString();
        }

        if( len >= 9 )
        {
            buf = new StringBuffer();
            buf.append(number.substring(0,9));
            buf.append(" ");
            buf.append(number.substring(9));

            number = buf.toString();
        }

        if( len >= 13)
        {
            buf = new StringBuffer();
            buf.append(number.substring(0,14));
            buf.append(" ");
            buf.append(number.substring(14));

            number = buf.toString();
        }


        return number;

    }

}
