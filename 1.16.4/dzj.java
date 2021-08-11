/*     */ import com.google.common.hash.Hashing;
/*     */ import com.mojang.authlib.GameProfile;
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
/*     */ public abstract class dzj
/*     */   extends bfw
/*     */ {
/*     */   private dwx e;
/*     */   public float a;
/*     */   public float b;
/*     */   public float c;
/*     */   public final dwt d;
/*     */   
/*     */   public dzj(dwt ☃, GameProfile gameProfile) {
/*  45 */     super(☃, ☃.u(), ☃.v(), gameProfile);
/*  46 */     this.d = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_() {
/*  51 */     dwx ☃ = djz.C().w().a(eA().getId());
/*  52 */     return (☃ != null && ☃.b() == bru.e);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b_() {
/*  57 */     dwx ☃ = djz.C().w().a(eA().getId());
/*  58 */     return (☃ != null && ☃.b() == bru.c);
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  62 */     return (f() != null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected dwx f() {
/*  67 */     if (this.e == null) {
/*  68 */       this.e = djz.C().w().a(bS());
/*     */     }
/*  70 */     return this.e;
/*     */   }
/*     */   
/*     */   public boolean n() {
/*  74 */     dwx ☃ = f();
/*  75 */     return (☃ != null && ☃.e());
/*     */   }
/*     */   
/*     */   public vk o() {
/*  79 */     dwx ☃ = f();
/*  80 */     return (☃ == null) ? ekj.a(bS()) : ☃.g();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public vk p() {
/*  85 */     dwx ☃ = f();
/*  86 */     return (☃ == null) ? null : ☃.h();
/*     */   }
/*     */   
/*     */   public boolean q() {
/*  90 */     return (f() != null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public vk r() {
/*  95 */     dwx ☃ = f();
/*  96 */     return (☃ == null) ? null : ☃.i();
/*     */   }
/*     */   
/*     */   public static ejt a(vk ☃, String str) {
/* 100 */     ekd ekd = djz.C().M();
/*     */     
/* 102 */     ejq ejq = ekd.b(☃);
/* 103 */     if (ejq == null) {
/* 104 */       ejq = new ejt(null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", new Object[] { aft.a(str) }), ekj.a(c(str)), true, null);
/* 105 */       ekd.a(☃, ejq);
/*     */     } 
/*     */     
/* 108 */     return (ejt)ejq;
/*     */   }
/*     */   
/*     */   public static vk d(String ☃) {
/* 112 */     return new vk("skins/" + Hashing.sha1().hashUnencodedChars(aft.a(☃)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String u() {
/* 120 */     dwx ☃ = f();
/* 121 */     return (☃ == null) ? ekj.b(bS()) : ☃.f();
/*     */   }
/*     */   
/*     */   public float v() {
/* 125 */     float ☃ = 1.0F;
/*     */ 
/*     */     
/* 128 */     if (this.bC.b) {
/* 129 */       ☃ *= 1.1F;
/*     */     }
/* 131 */     ☃ = (float)(☃ * (b(arl.d) / this.bC.b() + 1.0D) / 2.0D);
/*     */     
/* 133 */     if (this.bC.b() == 0.0F || Float.isNaN(☃) || Float.isInfinite(☃)) {
/* 134 */       ☃ = 1.0F;
/*     */     }
/*     */ 
/*     */     
/* 138 */     if (dW() && dY().b() == bmd.kc) {
/* 139 */       int i = ea();
/* 140 */       float f = i / 20.0F;
/* 141 */       if (f > 1.0F) {
/* 142 */         f = 1.0F;
/*     */       } else {
/* 144 */         f *= f;
/*     */       } 
/* 146 */       ☃ *= 1.0F - f * 0.15F;
/*     */     } 
/*     */     
/* 149 */     return afm.g((djz.C()).k.aQ, 1.0F, ☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */