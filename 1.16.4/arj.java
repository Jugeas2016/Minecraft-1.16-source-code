/*     */ import io.netty.util.internal.ThreadLocalRandom;
/*     */ import java.util.Objects;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Supplier;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ public class arj
/*     */ {
/*     */   private final double b;
/*     */   private final a c;
/*  15 */   private static final Logger a = LogManager.getLogger(); private final Supplier<String> d;
/*     */   private final UUID e;
/*     */   
/*  18 */   public enum a { a(0),
/*  19 */     b(1),
/*  20 */     c(2);
/*     */     
/*  22 */     private static final a[] d = new a[] { a, b, c };
/*     */     
/*     */     private final int e;
/*     */     
/*     */     a(int ☃) {
/*  27 */       this.e = ☃;
/*     */     } static {
/*     */     
/*     */     } public int a() {
/*  31 */       return this.e;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/*  35 */       if (☃ < 0 || ☃ >= d.length) {
/*  36 */         throw new IllegalArgumentException("No operation with value " + ☃);
/*     */       }
/*     */       
/*  39 */       return d[☃];
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public arj(String ☃, double d, a a1) {
/*  49 */     this(afm.a((Random)ThreadLocalRandom.current()), () -> ☃, d, a1);
/*     */   }
/*     */   
/*     */   public arj(UUID ☃, String str, double d, a a1) {
/*  53 */     this(☃, () -> ☃, d, a1);
/*     */   }
/*     */   
/*     */   public arj(UUID ☃, Supplier<String> supplier, double d, a a1) {
/*  57 */     this.e = ☃;
/*  58 */     this.d = supplier;
/*  59 */     this.b = d;
/*  60 */     this.c = a1;
/*     */   }
/*     */   
/*     */   public UUID a() {
/*  64 */     return this.e;
/*     */   }
/*     */   
/*     */   public String b() {
/*  68 */     return this.d.get();
/*     */   }
/*     */   
/*     */   public a c() {
/*  72 */     return this.c;
/*     */   }
/*     */   
/*     */   public double d() {
/*  76 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  81 */     if (this == ☃) {
/*  82 */       return true;
/*     */     }
/*  84 */     if (☃ == null || getClass() != ☃.getClass()) {
/*  85 */       return false;
/*     */     }
/*     */     
/*  88 */     arj arj1 = (arj)☃;
/*     */     
/*  90 */     return Objects.equals(this.e, arj1.e);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  95 */     return this.e.hashCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 100 */     return "AttributeModifier{amount=" + this.b + ", operation=" + this.c + ", name='" + (String)this.d
/*     */ 
/*     */       
/* 103 */       .get() + '\'' + ", id=" + this.e + '}';
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public md e() {
/* 109 */     md ☃ = new md();
/* 110 */     ☃.a("Name", b());
/* 111 */     ☃.a("Amount", this.b);
/* 112 */     ☃.b("Operation", this.c.a());
/* 113 */     ☃.a("UUID", this.e);
/* 114 */     return ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static arj a(md ☃) {
/*     */     try {
/* 120 */       UUID uUID = ☃.a("UUID");
/* 121 */       a a1 = a.a(☃.h("Operation"));
/* 122 */       return new arj(uUID, ☃.l("Name"), ☃.k("Amount"), a1);
/* 123 */     } catch (Exception exception) {
/* 124 */       a.warn("Unable to create attribute: {}", exception.getMessage());
/* 125 */       return null;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\arj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */