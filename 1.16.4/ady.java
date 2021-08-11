/*    */ import java.text.DecimalFormat;
/*    */ import java.text.DecimalFormatSymbols;
/*    */ import java.text.NumberFormat;
/*    */ import java.util.Locale;
/*    */ 
/*    */ public interface ady
/*    */ {
/*    */   public static final DecimalFormat a;
/*    */   
/*    */   static {
/* 11 */     a = x.<DecimalFormat>a(new DecimalFormat("########0.00"), ☃ -> ☃.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
/*    */   }
/* 13 */   public static final ady b = NumberFormat.getIntegerInstance(Locale.US)::format; static {
/* 14 */     c = (☃ -> a.format(☃ * 0.1D));
/* 15 */     d = (☃ -> {
/*    */         double d1 = ☃ / 100.0D;
/*    */ 
/*    */         
/*    */         double d2 = d1 / 1000.0D;
/*    */ 
/*    */         
/*    */         return (d2 > 0.5D) ? (a.format(d2) + " km") : ((d1 > 0.5D) ? (a.format(d1) + " m") : (☃ + " cm"));
/*    */       });
/*    */ 
/*    */     
/* 26 */     e = (☃ -> {
/*    */         double d1 = ☃ / 20.0D;
/*    */         double d2 = d1 / 60.0D;
/*    */         double d3 = d2 / 60.0D;
/*    */         double d4 = d3 / 24.0D;
/*    */         double d5 = d4 / 365.0D;
/*    */         return (d5 > 0.5D) ? (a.format(d5) + " y") : ((d4 > 0.5D) ? (a.format(d4) + " d") : ((d3 > 0.5D) ? (a.format(d3) + " h") : ((d2 > 0.5D) ? (a.format(d2) + " m") : (d1 + " s"))));
/*    */       });
/*    */   }
/*    */   
/*    */   public static final ady c;
/*    */   public static final ady d;
/*    */   public static final ady e;
/*    */   
/*    */   String format(int paramInt);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ady.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */