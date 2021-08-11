/*     */ import com.google.gson.JsonObject;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bt
/*     */   extends ck<bt.a>
/*     */ {
/*     */   private final vk a;
/*     */   
/*     */   public bt(vk ☃) {
/*  15 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public vk a() {
/*  20 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/*  25 */     return new a(this.a, b1, bg.b.a(☃, "entity", ax1), aw.a(☃.get("killing_blow")));
/*     */   }
/*     */   
/*     */   public void a(aah ☃, aqa aqa1, apk apk1) {
/*  29 */     cyv cyv = bg.b(☃, aqa1);
/*  30 */     a(☃, a1 -> a1.a(☃, cyv1, apk1));
/*     */   }
/*     */   
/*     */   public static class a extends al {
/*     */     private final bg.b a;
/*     */     private final aw b;
/*     */     
/*     */     public a(vk ☃, bg.b b1, bg.b b2, aw aw1) {
/*  38 */       super(☃, b1);
/*  39 */       this.a = b2;
/*  40 */       this.b = aw1;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static a a(bg.a ☃) {
/*  48 */       return new a(bt.a(ac.b), bg.b.a, bg.b.a(☃.b()), aw.a);
/*     */     }
/*     */     
/*     */     public static a c() {
/*  52 */       return new a(bt.a(ac.b), bg.b.a, bg.b.a, aw.a);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static a a(bg.a ☃, aw.a a1) {
/*  68 */       return new a(bt.a(ac.b), bg.b.a, bg.b.a(☃.b()), a1.b());
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static a d() {
/*  80 */       return new a(bt.a(ac.c), bg.b.a, bg.b.a, aw.a);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean a(aah ☃, cyv cyv1, apk apk1) {
/* 100 */       if (!this.b.a(☃, apk1)) {
/* 101 */         return false;
/*     */       }
/* 103 */       return this.a.a(cyv1);
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonObject a(ci ☃) {
/* 108 */       JsonObject jsonObject = super.a(☃);
/*     */       
/* 110 */       jsonObject.add("entity", this.a.a(☃));
/* 111 */       jsonObject.add("killing_blow", this.b.a());
/*     */       
/* 113 */       return jsonObject;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */