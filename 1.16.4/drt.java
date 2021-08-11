/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class drt
/*     */ {
/*     */   private final List<boq<?>> a;
/*     */   private final boolean b;
/*  18 */   private final Set<boq<?>> c = Sets.newHashSet();
/*  19 */   private final Set<boq<?>> d = Sets.newHashSet();
/*  20 */   private final Set<boq<?>> e = Sets.newHashSet();
/*     */   
/*     */   public drt(List<boq<?>> ☃) {
/*  23 */     this.a = (List<boq<?>>)ImmutableList.copyOf(☃);
/*     */     
/*  25 */     if (☃.size() <= 1) {
/*  26 */       this.b = true;
/*     */     } else {
/*  28 */       this.b = a(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static boolean a(List<boq<?>> ☃) {
/*  33 */     int i = ☃.size();
/*  34 */     bmb bmb = ((boq)☃.get(0)).c();
/*  35 */     for (int j = 1; j < i; j++) {
/*  36 */       bmb bmb1 = ((boq)☃.get(j)).c();
/*  37 */       if (!bmb.c(bmb, bmb1) || !bmb.a(bmb, bmb1)) {
/*  38 */         return false;
/*     */       }
/*     */     } 
/*  41 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  45 */     return !this.e.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(adt ☃) {
/*  49 */     for (boq<?> boq : this.a) {
/*  50 */       if (☃.b(boq)) {
/*  51 */         this.e.add(boq);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(bfy ☃, int i, int j, adt adt1) {
/*  57 */     for (boq<?> boq : this.a) {
/*  58 */       boolean bool = (boq.a(i, j) && adt1.b(boq));
/*  59 */       if (bool) {
/*  60 */         this.d.add(boq);
/*     */       } else {
/*  62 */         this.d.remove(boq);
/*     */       } 
/*  64 */       if (bool && ☃.a(boq, (IntList)null)) {
/*  65 */         this.c.add(boq); continue;
/*     */       } 
/*  67 */       this.c.remove(boq);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(boq<?> ☃) {
/*  73 */     return this.c.contains(☃);
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  77 */     return !this.c.isEmpty();
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  81 */     return !this.d.isEmpty();
/*     */   }
/*     */   
/*     */   public List<boq<?>> d() {
/*  85 */     return this.a;
/*     */   }
/*     */   
/*     */   public List<boq<?>> a(boolean ☃) {
/*  89 */     List<boq<?>> list = Lists.newArrayList();
/*  90 */     Set<boq<?>> set = ☃ ? this.c : this.d;
/*     */     
/*  92 */     for (boq<?> boq : this.a) {
/*  93 */       if (set.contains(boq)) {
/*  94 */         list.add(boq);
/*     */       }
/*     */     } 
/*     */     
/*  98 */     return list;
/*     */   }
/*     */   
/*     */   public List<boq<?>> b(boolean ☃) {
/* 102 */     List<boq<?>> list = Lists.newArrayList();
/*     */     
/* 104 */     for (boq<?> boq : this.a) {
/* 105 */       if (this.d.contains(boq) && this.c.contains(boq) == ☃) {
/* 106 */         list.add(boq);
/*     */       }
/*     */     } 
/*     */     
/* 110 */     return list;
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 114 */     return this.b;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\drt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */