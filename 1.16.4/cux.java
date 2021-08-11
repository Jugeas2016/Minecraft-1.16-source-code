/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.MapCodec;
/*     */ import java.util.Random;
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
/*     */ public final class cux
/*     */   extends cej<cuw, cux>
/*     */ {
/*  23 */   public static final Codec<cux> a = a(gm.O, cuw::h).stable();
/*     */ 
/*     */ 
/*     */   
/*     */   public cux(cuw ☃, ImmutableMap<cfj<?>, Comparable<?>> immutableMap, MapCodec<cux> mapCodec) {
/*  28 */     super(☃, immutableMap, mapCodec);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cuw a() {
/*  35 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  39 */     return a().c(this);
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  43 */     return a().b();
/*     */   }
/*     */   
/*     */   public float a(brc ☃, fx fx1) {
/*  47 */     return a().a(this, ☃, fx1);
/*     */   }
/*     */   
/*     */   public float d() {
/*  51 */     return a().a(this);
/*     */   }
/*     */   
/*     */   public int e() {
/*  55 */     return a().d(this);
/*     */   }
/*     */   
/*     */   public boolean b(brc ☃, fx fx1) {
/*  59 */     for (int i = -1; i <= 1; i++) {
/*  60 */       for (int j = -1; j <= 1; j++) {
/*  61 */         fx fx2 = fx1.b(i, 0, j);
/*  62 */         cux cux1 = ☃.b(fx2);
/*  63 */         if (!cux1.a().a(a()) && !☃.d_(fx2).i(☃, fx2)) {
/*  64 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*  68 */     return false;
/*     */   }
/*     */   
/*     */   public void a(brx ☃, fx fx1) {
/*  72 */     a().a(☃, fx1, this);
/*     */   }
/*     */   
/*     */   public void a(brx ☃, fx fx1, Random random) {
/*  76 */     a().a(☃, fx1, this, random);
/*     */   }
/*     */   
/*     */   public boolean f() {
/*  80 */     return a().j();
/*     */   }
/*     */   
/*     */   public void b(brx ☃, fx fx1, Random random) {
/*  84 */     a().b(☃, fx1, this, random);
/*     */   }
/*     */   
/*     */   public dcn c(brc ☃, fx fx1) {
/*  88 */     return a().a(☃, fx1, this);
/*     */   }
/*     */   
/*     */   public ceh g() {
/*  92 */     return a().b(this);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public hf h() {
/*  97 */     return a().i();
/*     */   }
/*     */   
/*     */   public boolean a(ael<cuw> ☃) {
/* 101 */     return a().a(☃);
/*     */   }
/*     */   
/*     */   public float i() {
/* 105 */     return a().c();
/*     */   }
/*     */   
/*     */   public boolean a(brc ☃, fx fx1, cuw cuw1, gc gc1) {
/* 109 */     return a().a(this, ☃, fx1, cuw1, gc1);
/*     */   }
/*     */   
/*     */   public ddh d(brc ☃, fx fx1) {
/* 113 */     return a().b(this, ☃, fx1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cux.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */