/*     */ import com.google.common.base.Objects;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aad
/*     */   extends aok
/*     */ {
/*  16 */   private final Set<aah> h = Sets.newHashSet();
/*  17 */   private final Set<aah> i = Collections.unmodifiableSet(this.h);
/*     */   private boolean j = true;
/*     */   
/*     */   public aad(nr ☃, aok.a a1, aok.b b1) {
/*  21 */     super(afm.a(), ☃, a1, b1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float ☃) {
/*  26 */     if (☃ != this.b) {
/*  27 */       super.a(☃);
/*  28 */       a(oz.a.c);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aok.a ☃) {
/*  34 */     if (☃ != this.c) {
/*  35 */       super.a(☃);
/*  36 */       a(oz.a.e);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aok.b ☃) {
/*  42 */     if (☃ != this.d) {
/*  43 */       super.a(☃);
/*  44 */       a(oz.a.e);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public aok a(boolean ☃) {
/*  50 */     if (☃ != this.e) {
/*  51 */       super.a(☃);
/*  52 */       a(oz.a.f);
/*     */     } 
/*  54 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public aok b(boolean ☃) {
/*  59 */     if (☃ != this.f) {
/*  60 */       super.b(☃);
/*  61 */       a(oz.a.f);
/*     */     } 
/*  63 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public aok c(boolean ☃) {
/*  68 */     if (☃ != this.g) {
/*  69 */       super.c(☃);
/*  70 */       a(oz.a.f);
/*     */     } 
/*  72 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nr ☃) {
/*  77 */     if (!Objects.equal(☃, this.a)) {
/*  78 */       super.a(☃);
/*  79 */       a(oz.a.d);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(oz.a ☃) {
/*  84 */     if (this.j) {
/*  85 */       oz oz = new oz(☃, this);
/*  86 */       for (aah aah : this.h) {
/*  87 */         aah.b.a(oz);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(aah ☃) {
/*  93 */     if (this.h.add(☃) && this.j) {
/*  94 */       ☃.b.a(new oz(oz.a.a, this));
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(aah ☃) {
/*  99 */     if (this.h.remove(☃) && this.j) {
/* 100 */       ☃.b.a(new oz(oz.a.b, this));
/*     */     }
/*     */   }
/*     */   
/*     */   public void b() {
/* 105 */     if (!this.h.isEmpty()) {
/* 106 */       for (aah ☃ : Lists.newArrayList(this.h)) {
/* 107 */         b(☃);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 113 */     return this.j;
/*     */   }
/*     */   
/*     */   public void d(boolean ☃) {
/* 117 */     if (☃ != this.j) {
/* 118 */       this.j = ☃;
/*     */       
/* 120 */       for (aah aah : this.h) {
/* 121 */         aah.b.a(new oz(☃ ? oz.a.a : oz.a.b, this));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public Collection<aah> h() {
/* 127 */     return this.i;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */