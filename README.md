
# Java Internet Connection Checker

This is Java simple internet connection Checker.

I using Eclipse to write this code



## Why I made it?
Actully it is my first project that I desided to upload in git. and I think first small & useful project in java (after giving up from PHP). So I made it.
## Run Locally

1. you can clone this progect with git command

```bash
  git clone https://github.com/skiarsi/java-internet-connection-checker.git
```

2. Import it with your IDE, I using Eclipse: 

```bash File->Open project from File System... ```


3. In Import project window, from Import source section, import downloaded project, and run it.


## Usage

App.js class

```bash
public class App {
	public static void main(String[] args) {
		new ViewForm();
	}
}

```
As you can see it is main class that calling another class named `ViewForm`

In the ViewForm class that extends `JFrame` I made a window with some basic specifications like size, title & ...

I made two lable named `label` for show green & red light two show internet connection is active or not
And another `label` named labelText to do same think with text

because of we will checking if internet connection is active or not runtime, I using Timer and TimerTask

```bash
Timer timer = new Timer();
TimerTask task = new TimerTask() {			

    @Override
    public void run() {
				
        try {
            URL url = new URL("https://www.google.com");
                URLConnection connection = url.openConnection();
            connection.connect();
            labelText.setText("Program is Connected");
            label.setBackground(Color.green);
        }catch (Exception e) {
            label.setBackground(Color.red);
            labelText.setText("Program is not Connected");
        }
				
    }
};
		
timer.scheduleAtFixedRate(task, 0, 2000);
```
