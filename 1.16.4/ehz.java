/*     */ import com.mojang.authlib.GameProfile;
/*     */ import org.apache.commons.lang3.StringUtils;
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
/*     */ public class ehz<T extends aqm, M extends duc<T> & dui>
/*     */   extends eit<T, M>
/*     */ {
/*     */   private final float a;
/*     */   private final float b;
/*     */   private final float c;
/*     */   
/*     */   public ehz(egk<T, M> ☃) {
/*  34 */     this(☃, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public ehz(egk<T, M> ☃, float f1, float f2, float f3) {
/*  38 */     super(☃);
/*  39 */     this.a = f1;
/*  40 */     this.b = f2;
/*  41 */     this.c = f3;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, eag eag1, int i, T t, float f1, float f2, float f3, float f4, float f5, float f6) {
/*  46 */     bmb bmb = t.b(aqf.f);
/*  47 */     if (bmb.a()) {
/*     */       return;
/*     */     }
/*     */     
/*  51 */     blx blx = bmb.b();
/*     */     
/*  53 */     ☃.a();
/*  54 */     ☃.a(this.a, this.b, this.c);
/*     */     
/*  56 */     boolean bool = (t instanceof bfj || t instanceof bek);
/*     */     
/*  58 */     if (t.w_() && !(t instanceof bfj)) {
/*  59 */       float f7 = 2.0F;
/*  60 */       float f8 = 1.4F;
/*  61 */       ☃.a(0.0D, 0.03125D, 0.0D);
/*  62 */       ☃.a(0.7F, 0.7F, 0.7F);
/*  63 */       ☃.a(0.0D, 1.0D, 0.0D);
/*     */     } 
/*     */     
/*  66 */     ((dui)aC_()).c().a(☃);
/*     */     
/*  68 */     if (blx instanceof bkh && ((bkh)blx).e() instanceof btq) {
/*  69 */       float f = 1.1875F;
/*  70 */       ☃.a(1.1875F, -1.1875F, -1.1875F);
/*  71 */       if (bool) {
/*  72 */         ☃.a(0.0D, 0.0625D, 0.0D);
/*     */       }
/*     */       
/*  75 */       GameProfile gameProfile = null;
/*  76 */       if (bmb.n()) {
/*  77 */         md md = bmb.o();
/*  78 */         if (md.c("SkullOwner", 10)) {
/*  79 */           gameProfile = mp.a(md.p("SkullOwner"));
/*  80 */         } else if (md.c("SkullOwner", 8)) {
/*  81 */           String str = md.l("SkullOwner");
/*  82 */           if (!StringUtils.isBlank(str)) {
/*  83 */             gameProfile = cdg.b(new GameProfile(null, str));
/*  84 */             md.a("SkullOwner", mp.a(new md(), gameProfile));
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/*  89 */       ☃.a(-0.5D, 0.0D, -0.5D);
/*  90 */       eco.a(null, 180.0F, ((btq)((bkh)blx).e()).b(), gameProfile, f1, ☃, eag1, i);
/*  91 */     } else if (!(blx instanceof bjy) || ((bjy)blx).b() != aqf.f) {
/*  92 */       float f = 0.625F;
/*  93 */       ☃.a(0.0D, -0.25D, 0.0D);
/*  94 */       ☃.a(g.d.a(180.0F));
/*  95 */       ☃.a(0.625F, -0.625F, -0.625F);
/*  96 */       if (bool) {
/*  97 */         ☃.a(0.0D, 0.1875D, 0.0D);
/*     */       }
/*     */       
/* 100 */       djz.C().ae().a((aqm)t, bmb, ebm.b.f, false, ☃, eag1, i);
/*     */     } 
/* 102 */     ☃.b();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ehz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */