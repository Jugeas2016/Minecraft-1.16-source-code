/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ public final class ja
/*    */ {
/*  6 */   public static final ja a = a("all");
/*  7 */   public static final ja b = a("texture", a);
/*  8 */   public static final ja c = a("particle", b);
/*  9 */   public static final ja d = a("end", a);
/* 10 */   public static final ja e = a("bottom", d);
/* 11 */   public static final ja f = a("top", d);
/* 12 */   public static final ja g = a("front", a);
/* 13 */   public static final ja h = a("back", a);
/* 14 */   public static final ja i = a("side", a);
/* 15 */   public static final ja j = a("north", i);
/* 16 */   public static final ja k = a("south", i);
/* 17 */   public static final ja l = a("east", i);
/* 18 */   public static final ja m = a("west", i);
/* 19 */   public static final ja n = a("up");
/* 20 */   public static final ja o = a("down");
/* 21 */   public static final ja p = a("cross");
/* 22 */   public static final ja q = a("plant");
/* 23 */   public static final ja r = a("wall", a);
/* 24 */   public static final ja s = a("rail");
/* 25 */   public static final ja t = a("wool");
/* 26 */   public static final ja u = a("pattern");
/* 27 */   public static final ja v = a("pane");
/* 28 */   public static final ja w = a("edge");
/* 29 */   public static final ja x = a("fan");
/* 30 */   public static final ja y = a("stem");
/* 31 */   public static final ja z = a("upperstem");
/* 32 */   public static final ja A = a("crop");
/* 33 */   public static final ja B = a("dirt");
/* 34 */   public static final ja C = a("fire");
/* 35 */   public static final ja D = a("lantern");
/* 36 */   public static final ja E = a("platform");
/* 37 */   public static final ja F = a("unsticky");
/* 38 */   public static final ja G = a("torch");
/* 39 */   public static final ja H = a("layer0");
/* 40 */   public static final ja I = a("lit_log");
/*    */   
/*    */   private final String J;
/*    */   
/*    */   @Nullable
/*    */   private final ja K;
/*    */   
/*    */   private static ja a(String ☃) {
/* 48 */     return new ja(☃, null);
/*    */   }
/*    */   
/*    */   private static ja a(String ☃, ja ja1) {
/* 52 */     return new ja(☃, ja1);
/*    */   }
/*    */   
/*    */   private ja(String ☃, @Nullable ja ja1) {
/* 56 */     this.J = ☃;
/* 57 */     this.K = ja1;
/*    */   }
/*    */   
/*    */   public String a() {
/* 61 */     return this.J;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public ja b() {
/* 66 */     return this.K;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 71 */     return "#" + this.J;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ja.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */