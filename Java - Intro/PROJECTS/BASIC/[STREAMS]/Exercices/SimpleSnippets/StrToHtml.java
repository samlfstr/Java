/*
* Created by Isa 15.1.2018 03:12
*/

import java.io.BufferedReader;
import java.io.FileReader;

public class StrToHtml implements Codes {

    private String line;
    private StringBuffer file_copy;
    private int varInt;

    public StrToHtml() {

    }

    @Override
    public String Infos() {
        return "Html 5 for more information please visit : https://www.w3schools.com/html/html5_intro.asp";
    }

    @Override
    public String Input(ShortCuts shortCuts) {

        switch (shortCuts) {
            case skeleton:
                try (
                        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\SAM\\Desktop\\HtmlSnippets\\skeleton.txt"));
                ) {
                    line = null;
                    file_copy = new StringBuffer();
                    while ((line = reader.readLine()) != null) {
                        file_copy.append(line).append("\n");
                    }

                } catch (Exception e) {
                    return "Error :" + e.getMessage();
                }
                return file_copy.toString();

            case formInput:
                try (
                        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\SAM\\Desktop\\HtmlSnippets\\form.txt"));
                ) {
                    line = null;
                    file_copy = new StringBuffer();
                    while ((line = reader.readLine()) != null) {
                        file_copy.append(line).append("\n");
                    }

                } catch (Exception e) {
                    return "Error :" + e.getMessage();
                }
                return file_copy.toString();

            case listElement:
                try (
                        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\SAM\\Desktop\\HtmlSnippets\\list.txt"));
                ) {
                    line = null;
                    file_copy = new StringBuffer();
                    while ((line = reader.readLine()) != null) {
                        file_copy.append(line).append("\n");
                    }

                } catch (Exception e) {
                    return "Error :" + e.getMessage();
                }
                return file_copy.toString();

        }

        return null;

    }


}
