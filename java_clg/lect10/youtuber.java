package lect10;

public class youtuber {
    public static void main(String[] args) {
        YouTube mrBeast = new YouTube();
        mrBeast.setChannelName("Mr. Beast");
        mrBeast.getChannelName();
        for (int i = 0; i < 10; i++) {
            mrBeast.setSubscribed();
        }
        mrBeast.getChannelName();
        // mrBeast.setUnSubscribed();
        // mrBeast.getChannelName();
    }
}

class YouTube{
    private String ChannelName;
    private int subsCount = 0;

    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    public void setSubscribed() {
        subsCount++;
    }

    public void setUnSubscribed() {
        subsCount--;
    }

    public void getChannelName() {
        System.out.println(this.ChannelName);
        System.out.println(this.subsCount);
    }
}
