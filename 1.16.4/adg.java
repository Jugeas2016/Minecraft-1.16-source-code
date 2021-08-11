/*    */ import java.util.UUID;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class adg
/*    */   implements da
/*    */ {
/* 18 */   private static final oe b = new oe("Rcon");
/* 19 */   private final StringBuffer c = new StringBuffer();
/*    */   private final MinecraftServer d;
/*    */   
/*    */   public adg(MinecraftServer ☃) {
/* 23 */     this.d = ☃;
/*    */   }
/*    */   
/*    */   public void d() {
/* 27 */     this.c.setLength(0);
/*    */   }
/*    */   
/*    */   public String e() {
/* 31 */     return this.c.toString();
/*    */   }
/*    */   
/*    */   public db f() {
/* 35 */     aag ☃ = this.d.E();
/* 36 */     return new db(this, dcn.b(☃.u()), dcm.a, ☃, 4, "Rcon", b, this.d, null);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nr ☃, UUID uUID) {
/* 41 */     this.c.append(☃.getString());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 46 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 51 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean R_() {
/* 56 */     return this.d.i();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\adg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */