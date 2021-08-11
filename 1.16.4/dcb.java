/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dcb
/*    */   implements dcd<MinecraftServer>
/*    */ {
/*    */   private final vk a;
/*    */   
/*    */   public dcb(vk ☃) {
/* 12 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(MinecraftServer ☃, dcf<MinecraftServer> dcf1, long l) {
/* 17 */     vx vx = ☃.aB();
/* 18 */     vx.a(this.a).ifPresent(cy1 -> ☃.a(cy1, ☃.e()));
/*    */   }
/*    */   
/*    */   public static class a extends dcd.a<MinecraftServer, dcb> {
/*    */     public a() {
/* 23 */       super(new vk("function"), dcb.class);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(md ☃, dcb dcb1) {
/* 28 */       ☃.a("Name", dcb.a(dcb1).toString());
/*    */     }
/*    */ 
/*    */     
/*    */     public dcb a(md ☃) {
/* 33 */       vk vk = new vk(☃.l("Name"));
/* 34 */       return new dcb(vk);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dcb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */