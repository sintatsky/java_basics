public class Main {
  public static void main(String[] args) {
    String text = "WASHINGTON — Congressional leaders clashed on Monday over " +
            "a stopgap spending bill to stave off a government shutdown at the end " +
            "of the month, as Democrats put forth a measure that omitted billions of " +
            "dollars in additional relief that President Trump had promised for farmers " +
            "battered by his trade policies and the coronavirus pandemic.\n" +
            "The dispute, which came as Republicans and Democrats had been nearing a " +
            "bipartisan deal on the measure, could jeopardize efforts to cement an agreement " +
            "to avert a lapse in government funding when the fiscal year ends on Sept. 30. " +
            "Lawmakers have less than a week of scheduled work days remaining to reach a deal " +
            "before they are slated to depart Washington for the final phase of their re-election campaigns.\n" +
            "The snag emerged after Democrats balked at including additional money in the " +
            "package for the Commodity Credit Corporation, arguing privately that Mr. Trump was " +
            "seeking to use it as a personal piggy bank to reward a politically " +
            "powerful constituency weeks before Election Day.\n";

    String string = text.replaceAll("\\p{Punct}","");
    System.out.println(string);
    String[] words = string.split("\\s");
    for (int i = 0; i < words.length; i++){
        System.out.println(words[i]);
    }
  }
}
