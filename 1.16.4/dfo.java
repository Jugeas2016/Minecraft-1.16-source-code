/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dfo
/*    */ {
/*    */   private final dfh a;
/* 11 */   private static final dfo b = new dfo();
/*    */   
/*    */   public static dfo a() {
/* 14 */     RenderSystem.assertThread(RenderSystem::isOnGameThreadOrInit);
/* 15 */     return b;
/*    */   }
/*    */   
/*    */   public dfo(int ☃) {
/* 19 */     this.a = new dfh(☃);
/*    */   }
/*    */   
/*    */   public dfo() {
/* 23 */     this(2097152);
/*    */   }
/*    */   
/*    */   public void b() {
/* 27 */     this.a.c();
/* 28 */     dfi.a(this.a);
/*    */   }
/*    */   
/*    */   public dfh c() {
/* 32 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */