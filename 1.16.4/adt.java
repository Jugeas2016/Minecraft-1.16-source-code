/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class adt
/*     */ {
/*  13 */   protected final Set<vk> a = Sets.newHashSet();
/*  14 */   protected final Set<vk> b = Sets.newHashSet();
/*     */   
/*  16 */   private final adu c = new adu();
/*     */   
/*     */   public void a(adt ☃) {
/*  19 */     this.a.clear();
/*  20 */     this.b.clear();
/*     */     
/*  22 */     this.c.a(☃.c);
/*     */     
/*  24 */     this.a.addAll(☃.a);
/*  25 */     this.b.addAll(☃.b);
/*     */   }
/*     */   
/*     */   public void a(boq<?> ☃) {
/*  29 */     if (!☃.af_()) {
/*  30 */       a(☃.f());
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(vk ☃) {
/*  35 */     this.a.add(☃);
/*     */   }
/*     */   
/*     */   public boolean b(@Nullable boq<?> ☃) {
/*  39 */     if (☃ == null) {
/*  40 */       return false;
/*     */     }
/*  42 */     return this.a.contains(☃.f());
/*     */   }
/*     */   
/*     */   public boolean b(vk ☃) {
/*  46 */     return this.a.contains(☃);
/*     */   }
/*     */   
/*     */   public void c(boq<?> ☃) {
/*  50 */     c(☃.f());
/*     */   }
/*     */   
/*     */   protected void c(vk ☃) {
/*  54 */     this.a.remove(☃);
/*  55 */     this.b.remove(☃);
/*     */   }
/*     */   
/*     */   public boolean d(boq<?> ☃) {
/*  59 */     return this.b.contains(☃.f());
/*     */   }
/*     */   
/*     */   public void e(boq<?> ☃) {
/*  63 */     this.b.remove(☃.f());
/*     */   }
/*     */   
/*     */   public void f(boq<?> ☃) {
/*  67 */     d(☃.f());
/*     */   }
/*     */   
/*     */   protected void d(vk ☃) {
/*  71 */     this.b.add(☃);
/*     */   }
/*     */   
/*     */   public boolean a(bjk ☃) {
/*  75 */     return this.c.a(☃);
/*     */   }
/*     */   
/*     */   public void a(bjk ☃, boolean bool) {
/*  79 */     this.c.a(☃, bool);
/*     */   }
/*     */   
/*     */   public boolean a(bjj<?> ☃) {
/*  83 */     return b(☃.m());
/*     */   }
/*     */   
/*     */   public boolean b(bjk ☃) {
/*  87 */     return this.c.b(☃);
/*     */   }
/*     */   
/*     */   public void b(bjk ☃, boolean bool) {
/*  91 */     this.c.b(☃, bool);
/*     */   }
/*     */   
/*     */   public void a(adu ☃) {
/*  95 */     this.c.a(☃);
/*     */   }
/*     */   
/*     */   public adu a() {
/*  99 */     return this.c.a();
/*     */   }
/*     */   
/*     */   public void a(bjk ☃, boolean bool1, boolean bool2) {
/* 103 */     this.c.a(☃, bool1);
/* 104 */     this.c.b(☃, bool2);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\adt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */