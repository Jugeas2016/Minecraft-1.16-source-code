/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class of
/*     */   extends nn
/*     */   implements nt
/*     */ {
/*  17 */   private static final Object[] d = new Object[0];
/*     */   
/*  19 */   private static final nu e = nu.b("%");
/*  20 */   private static final nu f = nu.b("null");
/*     */   
/*     */   private final String g;
/*     */   
/*     */   private final Object[] h;
/*     */   @Nullable
/*     */   private ly i;
/*  27 */   private final List<nu> j = Lists.newArrayList();
/*     */   
/*  29 */   private static final Pattern k = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");
/*     */   
/*     */   public of(String ☃) {
/*  32 */     this.g = ☃;
/*  33 */     this.h = d;
/*     */   }
/*     */   
/*     */   public of(String ☃, Object... arrayOfObject) {
/*  37 */     this.g = ☃;
/*  38 */     this.h = arrayOfObject;
/*     */   }
/*     */   
/*     */   private void k() {
/*  42 */     ly ☃ = ly.a();
/*  43 */     if (☃ == this.i) {
/*     */       return;
/*     */     }
/*  46 */     this.i = ☃;
/*  47 */     this.j.clear();
/*     */     
/*  49 */     String str = ☃.a(this.g);
/*     */     try {
/*  51 */       d(str);
/*  52 */     } catch (og og) {
/*  53 */       this.j.clear();
/*  54 */       this.j.add(nu.b(str));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d(String ☃) {
/*  59 */     Matcher matcher = k.matcher(☃);
/*     */     
/*     */     try {
/*  62 */       int i = 0;
/*  63 */       int j = 0;
/*     */       
/*  65 */       while (matcher.find(j)) {
/*  66 */         int k = matcher.start();
/*  67 */         int m = matcher.end();
/*     */         
/*  69 */         if (k > j) {
/*  70 */           String str = ☃.substring(j, k);
/*  71 */           if (str.indexOf('%') != -1) {
/*  72 */             throw new IllegalArgumentException();
/*     */           }
/*  74 */           this.j.add(nu.b(str));
/*     */         } 
/*     */         
/*  77 */         String str1 = matcher.group(2);
/*  78 */         String str2 = ☃.substring(k, m);
/*     */ 
/*     */         
/*  81 */         if ("%".equals(str1) && "%%".equals(str2)) {
/*  82 */           this.j.add(e);
/*  83 */         } else if ("s".equals(str1)) {
/*  84 */           String str = matcher.group(1);
/*  85 */           int n = (str != null) ? (Integer.parseInt(str) - 1) : i++;
/*  86 */           if (n < this.h.length) {
/*  87 */             this.j.add(b(n));
/*     */           }
/*     */         } else {
/*  90 */           throw new og(this, "Unsupported format: '" + str2 + "'");
/*     */         } 
/*     */         
/*  93 */         j = m;
/*     */       } 
/*     */       
/*  96 */       if (j < ☃.length()) {
/*  97 */         String str = ☃.substring(j);
/*  98 */         if (str.indexOf('%') != -1) {
/*  99 */           throw new IllegalArgumentException();
/*     */         }
/* 101 */         this.j.add(nu.b(str));
/*     */       } 
/* 103 */     } catch (IllegalArgumentException illegalArgumentException) {
/* 104 */       throw new og(this, illegalArgumentException);
/*     */     } 
/*     */   }
/*     */   
/*     */   private nu b(int ☃) {
/* 109 */     if (☃ >= this.h.length) {
/* 110 */       throw new og(this, ☃);
/*     */     }
/*     */     
/* 113 */     Object object = this.h[☃];
/*     */     
/* 115 */     if (object instanceof nr) {
/* 116 */       return (nr)object;
/*     */     }
/* 118 */     return (object == null) ? f : nu.b(object.toString());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public of h() {
/* 124 */     return new of(this.g, this.h);
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> Optional<T> b(nu.b<T> ☃, ob ob1) {
/* 129 */     k();
/*     */     
/* 131 */     for (nu nu1 : this.j) {
/* 132 */       Optional<T> optional = nu1.a(☃, ob1);
/* 133 */       if (optional.isPresent()) {
/* 134 */         return optional;
/*     */       }
/*     */     } 
/*     */     
/* 138 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> Optional<T> b(nu.a<T> ☃) {
/* 143 */     k();
/*     */     
/* 145 */     for (nu nu1 : this.j) {
/* 146 */       Optional<T> optional = nu1.a(☃);
/* 147 */       if (optional.isPresent()) {
/* 148 */         return optional;
/*     */       }
/*     */     } 
/*     */     
/* 152 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public nx a(@Nullable db ☃, @Nullable aqa aqa1, int i) throws CommandSyntaxException {
/* 157 */     Object[] arrayOfObject = new Object[this.h.length];
/*     */     
/* 159 */     for (int j = 0; j < arrayOfObject.length; j++) {
/* 160 */       Object object = this.h[j];
/* 161 */       if (object instanceof nr) {
/* 162 */         arrayOfObject[j] = ns.a(☃, (nr)object, aqa1, i);
/*     */       } else {
/* 164 */         arrayOfObject[j] = object;
/*     */       } 
/*     */     } 
/* 167 */     return new of(this.g, arrayOfObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 172 */     if (this == ☃) {
/* 173 */       return true;
/*     */     }
/*     */     
/* 176 */     if (☃ instanceof of) {
/* 177 */       of of1 = (of)☃;
/* 178 */       return (Arrays.equals(this.h, of1.h) && this.g.equals(of1.g) && super.equals(☃));
/*     */     } 
/*     */     
/* 181 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 186 */     int ☃ = super.hashCode();
/* 187 */     ☃ = 31 * ☃ + this.g.hashCode();
/* 188 */     ☃ = 31 * ☃ + Arrays.hashCode(this.h);
/* 189 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 194 */     return "TranslatableComponent{key='" + this.g + '\'' + ", args=" + 
/*     */       
/* 196 */       Arrays.toString(this.h) + ", siblings=" + this.a + ", style=" + 
/*     */       
/* 198 */       c() + '}';
/*     */   }
/*     */ 
/*     */   
/*     */   public String i() {
/* 203 */     return this.g;
/*     */   }
/*     */   
/*     */   public Object[] j() {
/* 207 */     return this.h;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\of.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */