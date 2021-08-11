/*    */ public class og
/*    */   extends IllegalArgumentException
/*    */ {
/*    */   public og(of ☃, String str) {
/*  5 */     super(String.format("Error parsing: %s: %s", new Object[] { ☃, str }));
/*    */   }
/*    */   
/*    */   public og(of ☃, int i) {
/*  9 */     super(String.format("Invalid index %d requested for %s", new Object[] { Integer.valueOf(i), ☃ }));
/*    */   }
/*    */   
/*    */   public og(of ☃, Throwable throwable) {
/* 13 */     super(String.format("Error while parsing: %s", new Object[] { ☃ }), throwable);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\og.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */