/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import java.util.Map;
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
/*    */ public class dso
/*    */   implements dss
/*    */ {
/*    */   private final GameProfile a;
/*    */   private final vk b;
/*    */   private final oe c;
/*    */   
/*    */   public dso(GameProfile ☃) {
/* 25 */     this.a = ☃;
/*    */     
/* 27 */     djz djz = djz.C();
/* 28 */     Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> map = djz.Z().a(☃);
/* 29 */     if (map.containsKey(MinecraftProfileTexture.Type.SKIN)) {
/* 30 */       this.b = djz.Z().a(map.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN);
/*    */     } else {
/* 32 */       this.b = ekj.a(bfw.a(☃));
/*    */     } 
/* 34 */     this.c = new oe(☃.getName());
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dsq ☃) {
/* 39 */     djz.C().w().a(new tr(this.a.getId()));
/*    */   }
/*    */ 
/*    */   
/*    */   public nr aA_() {
/* 44 */     return this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, float f, int i) {
/* 49 */     djz.C().M().a(this.b);
/* 50 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, i / 255.0F);
/* 51 */     dkw.a(☃, 2, 2, 12, 12, 8.0F, 8.0F, 8, 8, 64, 64);
/* 52 */     dkw.a(☃, 2, 2, 12, 12, 40.0F, 8.0F, 8, 8, 64, 64);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean aB_() {
/* 57 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dso.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */