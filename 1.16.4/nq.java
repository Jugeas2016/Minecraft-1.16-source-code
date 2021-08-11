/*    */ 
/*    */ public class nq
/*    */ {
/*  4 */   public static final nr a = new of("options.on");
/*  5 */   public static final nr b = new of("options.off");
/*    */   
/*  7 */   public static final nr c = new of("gui.done");
/*  8 */   public static final nr d = new of("gui.cancel");
/*  9 */   public static final nr e = new of("gui.yes");
/* 10 */   public static final nr f = new of("gui.no");
/* 11 */   public static final nr g = new of("gui.proceed");
/* 12 */   public static final nr h = new of("gui.back");
/*    */   
/* 14 */   public static final nr i = new of("connect.failed");
/*    */   
/*    */   public static nr a(boolean ☃) {
/* 17 */     return ☃ ? a : b;
/*    */   }
/*    */   
/*    */   public static nx a(nr ☃, boolean bool) {
/* 21 */     return new of(bool ? "options.on.composed" : "options.off.composed", new Object[] { ☃ });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */