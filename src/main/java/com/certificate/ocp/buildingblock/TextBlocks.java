package com.certificate.ocp.buildingblock;

public class TextBlocks {

    public static void main(String[] args) {
        String content ="Hello, World";
        int javaVersion = 17;
        String html = """ 
            <html>
                <body>
                    <p>%s</p>
                    <p>Java %d</p>
                </body>
            </html>
            """;
        System.out.println(html.formatted(content, javaVersion));
    }
}
