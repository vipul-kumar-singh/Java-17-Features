package com.vkstech.java17features.textBlock;

/**
 * Text blocks provide a simpler way to write multi-line strings,
 * improving readability, especially for formatted data like JSON, HTML, or SQL.
 */
public class TextBlockExample {
    public static void main(String[] args) {
        // JSON formatted using a text block
        String json = """
                {
                    "name": "Alice",
                    "age": 30,
                    "city": "New York",
                    "email": "alice@example.com"
                }
                """;

        System.out.println("JSON Data:");
        System.out.println(json);

        // SQL query formatted using a text block
        String query = """
                SELECT * FROM users
                WHERE age > 25
                ORDER BY name ASC
                """;

        System.out.println("SQL Query:");
        System.out.println(query);

        // HTML content using a text block
        String html = """
                <html>
                    <head>
                        <title>Text Blocks in Java</title>
                    </head>
                    <body>
                        <h1>Hello, World!</h1>
                        <p>This is an example of using text blocks in Java.</p>
                    </body>
                </html>
                """;

        System.out.println("HTML Content:");
        System.out.println(html);
    }
}

