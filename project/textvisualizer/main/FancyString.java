package main;

// This interface those objects for which there can be multiple string representations. The level represents how much detailed you want your.
// representation to be. 0 means very low detail and higher numbers correspond to higher detail.
public interface FancyString {

    public final int BRIEF = 0;
    public final int DEFAULT = 1;
    public final int VERBOSE = 2;

    public String fancy(int level);

}
