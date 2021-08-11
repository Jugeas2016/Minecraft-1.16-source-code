/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bsm
/*    */   extends afz.a
/*    */ {
/*    */   private final md b;
/*    */   
/*    */   public bsm() {
/* 15 */     super(1);
/*    */     
/* 17 */     this.b = new md();
/* 18 */     this.b.a("id", "minecraft:pig");
/*    */   }
/*    */   
/*    */   public bsm(md ☃) {
/* 22 */     this(☃.c("Weight", 99) ? ☃.h("Weight") : 1, ☃.p("Entity"));
/*    */   }
/*    */   
/*    */   public bsm(int ☃, md md1) {
/* 26 */     super(☃);
/*    */     
/* 28 */     this.b = md1;
/*    */ 
/*    */     
/* 31 */     vk vk = vk.a(md1.l("id"));
/* 32 */     if (vk != null) {
/* 33 */       md1.a("id", vk.toString());
/*    */     } else {
/* 35 */       md1.a("id", "minecraft:pig");
/*    */     } 
/*    */   }
/*    */   
/*    */   public md a() {
/* 40 */     md ☃ = new md();
/*    */     
/* 42 */     ☃.a("Entity", this.b);
/* 43 */     ☃.b("Weight", this.a);
/*    */     
/* 45 */     return ☃;
/*    */   }
/*    */   
/*    */   public md b() {
/* 49 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */