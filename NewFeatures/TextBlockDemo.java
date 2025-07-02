package NewFeatures;

public class TextBlockDemo {

    public static void main(String[] args) {

        String htmlCode = "<html>\n" +
                "<body>\n" +
                "</body>\n" +
                "</html>\n";

        System.out.println(htmlCode);
        System.out.println("********");


        //new code in java15
        String textBlock  = """
                <html>
                <body>
                <p>Hello World</p>
                </body>
                </html>
                """;
        System.out.println(textBlock);

    }

}
