package ooppart2;

public class Printer {
  private int tonerLevel;
  private int paperQuantity;
  private int pagePrinted;
  private boolean isDuplex;

  public Printer(int tonerLevel, boolean isDuplex) {
    this.paperQuantity = 150;
    this.isDuplex = isDuplex;
    if (tonerLevel > -1 && tonerLevel <= 100 ) {
      this.tonerLevel = tonerLevel;      
    } else {
      this.tonerLevel = 0;
    }
  }

  public int getTonerLevel() {
    return tonerLevel;
  }

  public int getPagePrinted() {
    return pagePrinted;
  }

  public boolean isDuplex() {
    return isDuplex;
  }

  public int getPaperQuantity() {
    return paperQuantity;
  }

  private void setPaperQuantity(int pagesToPrint) {
    if (this.isDuplex) {
      this.paperQuantity -= pagesToPrint / 2;
    } else {
      this.paperQuantity -= pagesToPrint;
    }
  }
  
  private boolean isEnoughPaper(int pagesToPrint) {
    if (this.isDuplex) {
      return this.paperQuantity >= pagesToPrint / 2;
    } else {
      return this.paperQuantity >= pagesToPrint;
    }
  }

  private void setPagePrinted(int pagePrinted) {
    this.pagePrinted = pagePrinted;
  }

  private boolean tonerFilled(int pagesToPrint) {
    return this.tonerLevel >= pagesToPrint;
  }

  public void fillUpToner(int tonerLevel) {
    if (this.tonerLevel <= 0) {
      System.out.println("Toner has not been filled up.");
      return;
    }
    this.tonerLevel += tonerLevel;
    if (this.tonerLevel >= 100) {
      this.tonerLevel = 100;
    }
    System.out.println("Toner level set to " + this.tonerLevel);
  }
  
  private void useToner(int pagesToPrint) {
    this.tonerLevel -= pagesToPrint;
  }
  
  public void printPages(int pagesToPrint) {
    if (!tonerFilled(pagesToPrint)) {
      System.out.println("Toner level is not sufficient to print " + pagesToPrint + " pages.");
      return;
    }    
    if (!isEnoughPaper(pagesToPrint)) {
      System.out.println("Paper quantity is not sufficient to print " + pagesToPrint + " pages.");
      return;
    }    
    setPagePrinted(pagesToPrint);
    useToner(pagesToPrint);
    setPaperQuantity(pagesToPrint);
    System.out.println("Successfully printed " + pagesToPrint + " pages." + 
            "\nToner level: " + this.tonerLevel + 
            "\nRemaining papers: " + this.paperQuantity);    
  }
  
  
}
