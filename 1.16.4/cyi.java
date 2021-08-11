/*    */ import com.mojang.serialization.Dynamic;
/*    */ import com.mojang.serialization.OptionalDynamic;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cyi
/*    */ {
/*    */   private final int a;
/*    */   private final long b;
/*    */   private final String c;
/*    */   private final int d;
/*    */   private final boolean e;
/*    */   
/*    */   public cyi(int ☃, long l, String str, int i, boolean bool) {
/* 15 */     this.a = ☃;
/* 16 */     this.b = l;
/* 17 */     this.c = str;
/* 18 */     this.d = i;
/* 19 */     this.e = bool;
/*    */   }
/*    */   
/*    */   public static cyi a(Dynamic<?> ☃) {
/* 23 */     int i = ☃.get("version").asInt(0);
/* 24 */     long l = ☃.get("LastPlayed").asLong(0L);
/* 25 */     OptionalDynamic<?> optionalDynamic = ☃.get("Version");
/*    */     
/* 27 */     if (optionalDynamic.result().isPresent()) {
/* 28 */       return new cyi(i, l, optionalDynamic
/*    */ 
/*    */           
/* 31 */           .get("Name").asString(w.a().getName()), optionalDynamic
/* 32 */           .get("Id").asInt(w.a().getWorldVersion()), optionalDynamic
/* 33 */           .get("Snapshot").asBoolean(!w.a().isStable()));
/*    */     }
/*    */     
/* 36 */     return new cyi(i, l, "", 0, false);
/*    */   }
/*    */   
/*    */   public int a() {
/* 40 */     return this.a;
/*    */   }
/*    */   
/*    */   public long b() {
/* 44 */     return this.b;
/*    */   }
/*    */   
/*    */   public String c() {
/* 48 */     return this.c;
/*    */   }
/*    */   
/*    */   public int d() {
/* 52 */     return this.d;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 56 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */