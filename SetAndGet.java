public class SetAndGet {
 private String name;
 private String version;
 private long downloads;
 private int size;
 private float rating;
 private boolean ad;

public String getName() {
 return name;
}

public void setName(String name) {
 this.name = name;
}

public String getVersion() {
 return version;
}

public void setVersion(String version) {
 this.version = version;
}

public long getDownloads() {
 return downloads;
}

public void setDownloads(long downloads) {
 this.downloads = downloads;
}

public int getSize() {
 return size;
}

public void setSize(int size) {
 this.size = size;
}

public float getRating() {
 return rating;
}

public void setRating(float rating) {
 this.rating = rating;
}

public boolean getAd() {
 return ad;
}

public void setAd(boolean ad) {
 this.ad = ad;
}

public static void main(String args[]){
 SetAndGet s = new SetAndGet();
 s.setName("Teleport.Video");
 s.setVersion("1.0.20201016");
 s.setDownloads(10000);
 s.setSize(32);
 s.setRating(4.2f);
 s.setAd(false);
 System.out.println("App Name:" +s.getName());
 System.out.println("Version:" +s.getVersion());
 System.out.println("Downloads:" +s.getDownloads());
 System.out.println("Size:" +s.getSize());
 System.out.println("Rating:" +s.getRating());
 System.out.println("Ad:" +s.getAd()); 
}
}