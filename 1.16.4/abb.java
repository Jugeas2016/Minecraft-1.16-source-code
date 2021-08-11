/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class abb
/*    */   implements uo
/*    */ {
/* 14 */   private static final nr a = new of("multiplayer.status.request_handled");
/*    */   
/*    */   private final MinecraftServer b;
/*    */   private final nd c;
/*    */   private boolean d;
/*    */   
/*    */   public abb(MinecraftServer ☃, nd nd1) {
/* 21 */     this.b = ☃;
/* 22 */     this.c = nd1;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(nr ☃) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public nd a() {
/* 32 */     return this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(uq ☃) {
/* 37 */     if (this.d) {
/* 38 */       this.c.a(a);
/*    */       return;
/*    */     } 
/* 41 */     this.d = true;
/* 42 */     this.c.a(new um(this.b.as()));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(up ☃) {
/* 47 */     this.c.a(new ul(☃.b()));
/* 48 */     this.c.a(a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\abb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */