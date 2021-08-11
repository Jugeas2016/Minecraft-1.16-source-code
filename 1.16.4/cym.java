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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface cym
/*    */   extends cyo
/*    */ {
/*    */   default void a(m ☃) {
/* 28 */     super.a(☃);
/* 29 */     ☃.a("Level name", this::g);
/* 30 */     ☃.a("Level game mode", () -> String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", new Object[] { m().b(), Integer.valueOf(m().a()), Boolean.valueOf(n()), Boolean.valueOf(o()) }));
/* 31 */     ☃.a("Level weather", () -> String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", new Object[] { Integer.valueOf(l()), Boolean.valueOf(k()), Integer.valueOf(j()), Boolean.valueOf(i()) }));
/*    */   }
/*    */   
/*    */   String g();
/*    */   
/*    */   void a(boolean paramBoolean);
/*    */   
/*    */   int l();
/*    */   
/*    */   void f(int paramInt);
/*    */   
/*    */   void e(int paramInt);
/*    */   
/*    */   int j();
/*    */   
/*    */   int h();
/*    */   
/*    */   void a(int paramInt);
/*    */   
/*    */   int v();
/*    */   
/*    */   void g(int paramInt);
/*    */   
/*    */   int w();
/*    */   
/*    */   void h(int paramInt);
/*    */   
/*    */   void a(UUID paramUUID);
/*    */   
/*    */   bru m();
/*    */   
/*    */   void a(cfu.c paramc);
/*    */   
/*    */   cfu.c r();
/*    */   
/*    */   boolean p();
/*    */   
/*    */   void c(boolean paramBoolean);
/*    */   
/*    */   boolean o();
/*    */   
/*    */   void a(bru parambru);
/*    */   
/*    */   dcf<MinecraftServer> u();
/*    */   
/*    */   void a(long paramLong);
/*    */   
/*    */   void b(long paramLong);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cym.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */