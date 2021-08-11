/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.EnumMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ega
/*     */   extends efw<bal, duy<bal>>
/*     */ {
/*     */   private static final Map<bal.a, vk> a;
/*     */   
/*     */   static {
/*  16 */     a = x.<Map<bal.a, vk>>a(Maps.newEnumMap(bal.a.class), ☃ -> {
/*     */           ☃.put(bal.a.a, new vk("textures/entity/panda/panda.png"));
/*     */           ☃.put(bal.a.b, new vk("textures/entity/panda/lazy_panda.png"));
/*     */           ☃.put(bal.a.c, new vk("textures/entity/panda/worried_panda.png"));
/*     */           ☃.put(bal.a.d, new vk("textures/entity/panda/playful_panda.png"));
/*     */           ☃.put(bal.a.e, new vk("textures/entity/panda/brown_panda.png"));
/*     */           ☃.put(bal.a.f, new vk("textures/entity/panda/weak_panda.png"));
/*     */           ☃.put(bal.a.g, new vk("textures/entity/panda/aggressive_panda.png"));
/*     */         });
/*     */   }
/*     */   public ega(eet ☃) {
/*  27 */     super(☃, new duy<>(9, 0.0F), 0.9F);
/*     */     
/*  29 */     a(new eiq(this));
/*     */   }
/*     */ 
/*     */   
/*     */   public vk a(bal ☃) {
/*  34 */     return a.getOrDefault(☃.eZ(), a.get(bal.a.a));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(bal ☃, dfm dfm1, float f1, float f2, float f3) {
/*  39 */     super.a(☃, dfm1, f1, f2, f3);
/*     */     
/*  41 */     if (☃.bo > 0) {
/*  42 */       int i = ☃.bo;
/*  43 */       int j = i + 1;
/*     */       
/*  45 */       float f6 = 7.0F;
/*  46 */       float f7 = ☃.w_() ? 0.3F : 0.8F;
/*     */       
/*  48 */       if (i < 8) {
/*  49 */         float f9 = (90 * i) / 7.0F;
/*  50 */         float f10 = (90 * j) / 7.0F;
/*  51 */         float f8 = a(f9, f10, j, f3, 8.0F);
/*     */         
/*  53 */         dfm1.a(0.0D, ((f7 + 0.2F) * f8 / 90.0F), 0.0D);
/*  54 */         dfm1.a(g.b.a(-f8));
/*  55 */       } else if (i < 16) {
/*  56 */         float f9 = (i - 8.0F) / 7.0F;
/*  57 */         float f10 = 90.0F + 90.0F * f9;
/*  58 */         float f11 = 90.0F + 90.0F * (j - 8.0F) / 7.0F;
/*  59 */         float f8 = a(f10, f11, j, f3, 16.0F);
/*     */         
/*  61 */         dfm1.a(0.0D, (f7 + 0.2F + (f7 - 0.2F) * (f8 - 90.0F) / 90.0F), 0.0D);
/*  62 */         dfm1.a(g.b.a(-f8));
/*  63 */       } else if (i < 24.0F) {
/*  64 */         float f9 = (i - 16.0F) / 7.0F;
/*  65 */         float f10 = 180.0F + 90.0F * f9;
/*  66 */         float f11 = 180.0F + 90.0F * (j - 16.0F) / 7.0F;
/*  67 */         float f8 = a(f10, f11, j, f3, 24.0F);
/*     */         
/*  69 */         dfm1.a(0.0D, (f7 + f7 * (270.0F - f8) / 90.0F), 0.0D);
/*  70 */         dfm1.a(g.b.a(-f8));
/*  71 */       } else if (i < 32) {
/*  72 */         float f9 = (i - 24.0F) / 7.0F;
/*  73 */         float f10 = 270.0F + 90.0F * f9;
/*  74 */         float f11 = 270.0F + 90.0F * (j - 24.0F) / 7.0F;
/*  75 */         float f8 = a(f10, f11, j, f3, 32.0F);
/*     */         
/*  77 */         dfm1.a(0.0D, (f7 * (360.0F - f8) / 90.0F), 0.0D);
/*  78 */         dfm1.a(g.b.a(-f8));
/*     */       } 
/*     */     } 
/*     */     
/*  82 */     float f4 = ☃.y(f3);
/*  83 */     if (f4 > 0.0F) {
/*  84 */       dfm1.a(0.0D, (0.8F * f4), 0.0D);
/*  85 */       dfm1.a(g.b.a(afm.g(f4, ☃.q, ☃.q + 90.0F)));
/*     */ 
/*     */       
/*  88 */       dfm1.a(0.0D, (-1.0F * f4), 0.0D);
/*     */       
/*  90 */       if (☃.ff()) {
/*  91 */         float f = (float)(Math.cos(☃.K * 1.25D) * Math.PI * 0.05000000074505806D);
/*     */         
/*  93 */         dfm1.a(g.d.a(f));
/*  94 */         if (☃.w_()) {
/*  95 */           dfm1.a(0.0D, 0.800000011920929D, 0.550000011920929D);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 100 */     float f5 = ☃.z(f3);
/* 101 */     if (f5 > 0.0F) {
/* 102 */       float f = ☃.w_() ? 0.5F : 1.3F;
/* 103 */       dfm1.a(0.0D, (f * f5), 0.0D);
/* 104 */       dfm1.a(g.b.a(afm.g(f5, ☃.q, ☃.q + 180.0F)));
/*     */     } 
/*     */   }
/*     */   
/*     */   private float a(float ☃, float f1, int i, float f2, float f3) {
/* 109 */     if (i < f3) {
/* 110 */       return afm.g(f2, ☃, f1);
/*     */     }
/* 112 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ega.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */