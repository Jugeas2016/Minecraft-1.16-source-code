/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dcc
/*    */   implements dcd<MinecraftServer>
/*    */ {
/*    */   private final vk a;
/*    */   
/*    */   public dcc(vk ☃) {
/* 14 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(MinecraftServer ☃, dcf<MinecraftServer> dcf1, long l) {
/* 19 */     vx vx = ☃.aB();
/* 20 */     ael<cy> ael = vx.b(this.a);
/* 21 */     for (cy cy : ael.b())
/* 22 */       vx.a(cy, vx.e()); 
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends dcd.a<MinecraftServer, dcc> {
/*    */     public a() {
/* 28 */       super(new vk("function_tag"), dcc.class);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(md ☃, dcc dcc1) {
/* 33 */       ☃.a("Name", dcc.a(dcc1).toString());
/*    */     }
/*    */ 
/*    */     
/*    */     public dcc a(md ☃) {
/* 38 */       vk vk = new vk(☃.l("Name"));
/* 39 */       return new dcc(vk);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dcc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */