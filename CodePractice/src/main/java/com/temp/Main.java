/* Save this in a file called Main.java to compile and test it */

/* 
   Example file showing how to write a program that reads
   input from `input.txt` in the current directory
   and writes output to `output.txt` in the current directory
*/

/* Do not add a package declaration */
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
class App{
	String appName, apiName;
	int version;

	public App() {}
	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	
	
}
public class Main {
    public static void main (String[] args) {
        try {
            //Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            Stream<String> fileLines = Files.lines(Paths.get("input.txt"));
            /* Here we can read in the input file */
            /* In this example, we're reading all the lines of file
               `input.txt` and then ignoring them. 
               You should modify this part of the
               program to read and process the input as desired */
      /*      while(in.hasNextLine()) {
                String line = in.nextLine();
                
                if (!line.isEmpty()) {
                    numLines++;
                    inputData.add(line);
                }
            }*/
            Optional<App> ap= fileLines.map(x->x.split(",")).map(x->{
            	App app = new App();
            	app.setAppName(x[0]);
            	app.setApiName(x[1]);
            	app.setVersion(Integer.parseInt(x[2].replaceAll("[^0-9]", "")));
            	return app;
            }).sorted(Comparator.comparing(App::getAppName).thenComparing(App::getApiName).thenComparing(App::getVersion)).findFirst();
           
            /* In this example, we're writing `num_lines` to
               the file `output.txt`.
               You should modify this part of the
               program to write the desired output */
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            if(ap.isPresent())
            output.println("" +ap.get().getAppName());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}

