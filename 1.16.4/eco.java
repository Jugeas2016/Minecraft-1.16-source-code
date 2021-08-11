/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class eco
/*     */   extends ece<cdg>
/*     */ {
/*     */   private static final Map<bzv.a, dvt> a;
/*     */   private static final Map<bzv.a, vk> c;
/*     */   
/*     */   static {
/*  30 */     a = x.<Map<bzv.a, dvt>>a(Maps.newHashMap(), ☃ -> {
/*     */           dvt dvt1 = new dvt(0, 0, 64, 32);
/*     */           
/*     */           dvt dvt2 = new dul();
/*     */           
/*     */           dwl dwl = new dwl(0.0F);
/*     */           ☃.put(bzv.b.a, dvt1);
/*     */           ☃.put(bzv.b.b, dvt1);
/*     */           ☃.put(bzv.b.c, dvt2);
/*     */           ☃.put(bzv.b.d, dvt2);
/*     */           ☃.put(bzv.b.e, dvt1);
/*     */           ☃.put(bzv.b.f, dwl);
/*     */         });
/*  43 */     c = x.<Map<bzv.a, vk>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put(bzv.b.a, new vk("textures/entity/skeleton/skeleton.png"));
/*     */           ☃.put(bzv.b.b, new vk("textures/entity/skeleton/wither_skeleton.png"));
/*     */           ☃.put(bzv.b.d, new vk("textures/entity/zombie/zombie.png"));
/*     */           ☃.put(bzv.b.e, new vk("textures/entity/creeper/creeper.png"));
/*     */           ☃.put(bzv.b.f, new vk("textures/entity/enderdragon/dragon.png"));
/*     */           ☃.put(bzv.b.c, ekj.a());
/*     */         });
/*     */   }
/*     */   public eco(ecd ☃) {
/*  53 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cdg ☃, float f, dfm dfm1, eag eag1, int i, int j) {
/*  58 */     float f1 = ☃.a(f);
/*     */     
/*  60 */     ceh ceh = ☃.p();
/*  61 */     boolean bool = ceh.b() instanceof cbm;
/*  62 */     gc gc = bool ? (gc)ceh.c(cbm.a) : null;
/*  63 */     float f2 = 22.5F * (bool ? ((2 + gc.d()) * 4) : ((Integer)ceh.c(bzv.a)).intValue());
/*     */     
/*  65 */     a(gc, f2, ((btq)ceh.b()).b(), ☃.d(), f1, dfm1, eag1, i);
/*     */   }
/*     */   
/*     */   public static void a(@Nullable gc ☃, float f1, bzv.a a1, @Nullable GameProfile gameProfile, float f2, dfm dfm1, eag eag1, int i) {
/*  69 */     dvt dvt = a.get(a1);
/*     */     
/*  71 */     dfm1.a();
/*     */     
/*  73 */     if (☃ == null) {
/*  74 */       dfm1.a(0.5D, 0.0D, 0.5D);
/*     */     } else {
/*  76 */       float f = 0.25F;
/*  77 */       dfm1.a((0.5F - ☃
/*  78 */           .i() * 0.25F), 0.25D, (0.5F - ☃
/*     */           
/*  80 */           .k() * 0.25F));
/*     */     } 
/*     */ 
/*     */     
/*  84 */     dfm1.a(-1.0F, -1.0F, 1.0F);
/*     */     
/*  86 */     dfq dfq = eag1.getBuffer(a(a1, gameProfile));
/*  87 */     dvt.a(f2, f1, 0.0F);
/*  88 */     dvt.a(dfm1, dfq, i, ejw.a, 1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/*  90 */     dfm1.b();
/*     */   }
/*     */   
/*     */   private static eao a(bzv.a ☃, @Nullable GameProfile gameProfile) {
/*  94 */     vk vk = c.get(☃);
/*  95 */     if (☃ != bzv.b.c || gameProfile == null) {
/*  96 */       return eao.e(vk);
/*     */     }
/*     */     
/*  99 */     djz djz = djz.C();
/* 100 */     Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> map = djz.Z().a(gameProfile);
/* 101 */     if (map.containsKey(MinecraftProfileTexture.Type.SKIN))
/*     */     {
/* 103 */       return eao.h(djz.Z().a(map.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN));
/*     */     }
/* 105 */     return eao.d(ekj.a(bfw.a(gameProfile)));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eco.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */