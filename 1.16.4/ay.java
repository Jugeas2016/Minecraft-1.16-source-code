/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonNull;
/*    */ import com.google.gson.JsonObject;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ay
/*    */ {
/* 12 */   public static final ay a = new ay(bz.c.e, bz.c.e, bz.c.e, bz.c.e, bz.c.e);
/*    */   
/*    */   private final bz.c b;
/*    */   private final bz.c c;
/*    */   private final bz.c d;
/*    */   private final bz.c e;
/*    */   private final bz.c f;
/*    */   
/*    */   public ay(bz.c ☃, bz.c c1, bz.c c2, bz.c c3, bz.c c4) {
/* 21 */     this.b = ☃;
/* 22 */     this.c = c1;
/* 23 */     this.d = c2;
/* 24 */     this.e = c3;
/* 25 */     this.f = c4;
/*    */   }
/*    */   
/*    */   public static ay a(bz.c ☃) {
/* 29 */     return new ay(bz.c.e, bz.c.e, bz.c.e, ☃, bz.c.e);
/*    */   }
/*    */   
/*    */   public static ay b(bz.c ☃) {
/* 33 */     return new ay(bz.c.e, ☃, bz.c.e, bz.c.e, bz.c.e);
/*    */   }
/*    */   
/*    */   public boolean a(double ☃, double d1, double d2, double d3, double d4, double d5) {
/* 37 */     float f1 = (float)(☃ - d3);
/* 38 */     float f2 = (float)(d1 - d4);
/* 39 */     float f3 = (float)(d2 - d5);
/* 40 */     if (!this.b.d(afm.e(f1)) || !this.c.d(afm.e(f2)) || !this.d.d(afm.e(f3))) {
/* 41 */       return false;
/*    */     }
/* 43 */     if (!this.e.a((f1 * f1 + f3 * f3))) {
/* 44 */       return false;
/*    */     }
/* 46 */     if (!this.f.a((f1 * f1 + f2 * f2 + f3 * f3))) {
/* 47 */       return false;
/*    */     }
/* 49 */     return true;
/*    */   }
/*    */   
/*    */   public static ay a(@Nullable JsonElement ☃) {
/* 53 */     if (☃ == null || ☃.isJsonNull()) {
/* 54 */       return a;
/*    */     }
/* 56 */     JsonObject jsonObject = afd.m(☃, "distance");
/* 57 */     bz.c c1 = bz.c.a(jsonObject.get("x"));
/* 58 */     bz.c c2 = bz.c.a(jsonObject.get("y"));
/* 59 */     bz.c c3 = bz.c.a(jsonObject.get("z"));
/* 60 */     bz.c c4 = bz.c.a(jsonObject.get("horizontal"));
/* 61 */     bz.c c5 = bz.c.a(jsonObject.get("absolute"));
/* 62 */     return new ay(c1, c2, c3, c4, c5);
/*    */   }
/*    */   
/*    */   public JsonElement a() {
/* 66 */     if (this == a) {
/* 67 */       return (JsonElement)JsonNull.INSTANCE;
/*    */     }
/*    */     
/* 70 */     JsonObject ☃ = new JsonObject();
/*    */     
/* 72 */     ☃.add("x", this.b.d());
/* 73 */     ☃.add("y", this.c.d());
/* 74 */     ☃.add("z", this.d.d());
/* 75 */     ☃.add("horizontal", this.e.d());
/* 76 */     ☃.add("absolute", this.f.d());
/*    */     
/* 78 */     return (JsonElement)☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */