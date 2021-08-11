/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.properties.Property;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.UUID;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public final class mp
/*     */ {
/*  35 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static GameProfile a(md ☃) {
/*  43 */     String str = null;
/*  44 */     UUID uUID = null;
/*     */     
/*  46 */     if (☃.c("Name", 8)) {
/*  47 */       str = ☃.l("Name");
/*     */     }
/*  49 */     if (☃.b("Id")) {
/*  50 */       uUID = ☃.a("Id");
/*     */     }
/*     */     
/*     */     try {
/*  54 */       GameProfile gameProfile = new GameProfile(uUID, str);
/*     */       
/*  56 */       if (☃.c("Properties", 10)) {
/*  57 */         md md1 = ☃.p("Properties");
/*     */         
/*  59 */         for (String str1 : md1.d()) {
/*  60 */           mj mj = md1.d(str1, 10);
/*  61 */           for (int i = 0; i < mj.size(); i++) {
/*  62 */             md md2 = mj.a(i);
/*  63 */             String str2 = md2.l("Value");
/*     */             
/*  65 */             if (md2.c("Signature", 8)) {
/*  66 */               gameProfile.getProperties().put(str1, new Property(str1, str2, md2.l("Signature")));
/*     */             } else {
/*  68 */               gameProfile.getProperties().put(str1, new Property(str1, str2));
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/*  74 */       return gameProfile;
/*  75 */     } catch (Throwable throwable) {
/*     */       
/*  77 */       return null;
/*     */     } 
/*     */   }
/*     */   public static md a(md ☃, GameProfile gameProfile) {
/*  81 */     if (!aft.b(gameProfile.getName())) {
/*  82 */       ☃.a("Name", gameProfile.getName());
/*     */     }
/*  84 */     if (gameProfile.getId() != null) {
/*  85 */       ☃.a("Id", gameProfile.getId());
/*     */     }
/*  87 */     if (!gameProfile.getProperties().isEmpty()) {
/*  88 */       md md1 = new md();
/*  89 */       for (String str : gameProfile.getProperties().keySet()) {
/*  90 */         mj mj = new mj();
/*  91 */         for (Property property : gameProfile.getProperties().get(str)) {
/*  92 */           md md2 = new md();
/*  93 */           md2.a("Value", property.getValue());
/*  94 */           if (property.hasSignature()) {
/*  95 */             md2.a("Signature", property.getSignature());
/*     */           }
/*  97 */           mj.add(md2);
/*     */         } 
/*  99 */         md1.a(str, mj);
/*     */       } 
/* 101 */       ☃.a("Properties", md1);
/*     */     } 
/*     */     
/* 104 */     return ☃;
/*     */   }
/*     */   
/*     */   @VisibleForTesting
/*     */   public static boolean a(@Nullable mt ☃, @Nullable mt mt1, boolean bool) {
/* 109 */     if (☃ == mt1) {
/* 110 */       return true;
/*     */     }
/* 112 */     if (☃ == null) {
/* 113 */       return true;
/*     */     }
/* 115 */     if (mt1 == null) {
/* 116 */       return false;
/*     */     }
/* 118 */     if (!☃.getClass().equals(mt1.getClass())) {
/* 119 */       return false;
/*     */     }
/*     */     
/* 122 */     if (☃ instanceof md) {
/* 123 */       md md1 = (md)☃;
/* 124 */       md md2 = (md)mt1;
/*     */       
/* 126 */       for (String str : md1.d()) {
/* 127 */         mt mt2 = md1.c(str);
/* 128 */         if (!a(mt2, md2.c(str), bool)) {
/* 129 */           return false;
/*     */         }
/*     */       } 
/*     */       
/* 133 */       return true;
/* 134 */     }  if (☃ instanceof mj && bool) {
/* 135 */       mj mj1 = (mj)☃;
/* 136 */       mj mj2 = (mj)mt1;
/*     */       
/* 138 */       if (mj1.isEmpty()) {
/* 139 */         return mj2.isEmpty();
/*     */       }
/*     */       
/* 142 */       for (int i = 0; i < mj1.size(); i++) {
/* 143 */         mt mt2 = mj1.k(i);
/* 144 */         boolean bool1 = false;
/* 145 */         for (int j = 0; j < mj2.size(); j++) {
/* 146 */           if (a(mt2, mj2.k(j), bool)) {
/* 147 */             bool1 = true;
/*     */             break;
/*     */           } 
/*     */         } 
/* 151 */         if (!bool1) {
/* 152 */           return false;
/*     */         }
/*     */       } 
/*     */       
/* 156 */       return true;
/*     */     } 
/* 158 */     return ☃.equals(mt1);
/*     */   }
/*     */ 
/*     */   
/*     */   public static mh a(UUID ☃) {
/* 163 */     return new mh(gq.a(☃));
/*     */   }
/*     */   
/*     */   public static UUID a(mt ☃) {
/* 167 */     if (☃.b() != mh.a) {
/* 168 */       throw new IllegalArgumentException("Expected UUID-Tag to be of type " + mh.a.a() + ", but found " + ☃.b().a() + ".");
/*     */     }
/* 170 */     int[] arrayOfInt = ((mh)☃).g();
/* 171 */     if (arrayOfInt.length != 4) {
/* 172 */       throw new IllegalArgumentException("Expected UUID-Array to be of length 4, but found " + arrayOfInt.length + ".");
/*     */     }
/* 174 */     return gq.a(arrayOfInt);
/*     */   }
/*     */   
/*     */   public static fx b(md ☃) {
/* 178 */     return new fx(☃.h("X"), ☃.h("Y"), ☃.h("Z"));
/*     */   }
/*     */   
/*     */   public static md a(fx ☃) {
/* 182 */     md md = new md();
/* 183 */     md.b("X", ☃.u());
/* 184 */     md.b("Y", ☃.v());
/* 185 */     md.b("Z", ☃.w());
/* 186 */     return md;
/*     */   }
/*     */   
/*     */   public static ceh c(md ☃) {
/* 190 */     if (!☃.c("Name", 8)) {
/* 191 */       return bup.a.n();
/*     */     }
/*     */     
/* 194 */     buo buo = gm.Q.a(new vk(☃.l("Name")));
/* 195 */     ceh ceh = buo.n();
/*     */     
/* 197 */     if (☃.c("Properties", 10)) {
/* 198 */       md md1 = ☃.p("Properties");
/*     */       
/* 200 */       cei<buo, ceh> cei = buo.m();
/* 201 */       for (String str : md1.d()) {
/* 202 */         cfj<?> cfj = cei.a(str);
/* 203 */         if (cfj != null) {
/* 204 */           ceh = a(ceh, cfj, str, md1, ☃);
/*     */         }
/*     */       } 
/*     */     } 
/* 208 */     return ceh;
/*     */   }
/*     */ 
/*     */   
/*     */   private static <S extends cej<?, S>, T extends Comparable<T>> S a(S ☃, cfj<T> cfj1, String str, md md1, md md2) {
/* 213 */     Optional<T> optional = cfj1.b(md1.l(str));
/* 214 */     if (optional.isPresent()) {
/* 215 */       return (S)☃.a(cfj1, (Comparable)optional.get());
/*     */     }
/*     */     
/* 218 */     a.warn("Unable to read property: {} with value: {} for blockstate: {}", str, md1.l(str), md2.toString());
/* 219 */     return ☃;
/*     */   }
/*     */   
/*     */   public static md a(ceh ☃) {
/* 223 */     md md = new md();
/* 224 */     md.a("Name", gm.Q.b(☃.b()).toString());
/*     */     
/* 226 */     ImmutableMap<cfj<?>, Comparable<?>> immutableMap = ☃.s();
/* 227 */     if (!immutableMap.isEmpty()) {
/* 228 */       md md1 = new md();
/*     */       
/* 230 */       for (UnmodifiableIterator<Map.Entry<cfj<?>, Comparable<?>>> unmodifiableIterator = immutableMap.entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<cfj<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 231 */         cfj<?> cfj = entry.getKey();
/* 232 */         md1.a(cfj.f(), a(cfj, entry.getValue())); }
/*     */       
/* 234 */       md.a("Properties", md1);
/*     */     } 
/*     */     
/* 237 */     return md;
/*     */   }
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
/*     */   private static <T extends Comparable<T>> String a(cfj<T> ☃, Comparable<?> comparable) {
/* 261 */     return ☃.a((T)comparable);
/*     */   }
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
/*     */   public static md a(DataFixer ☃, aga aga1, md md1, int i) {
/* 462 */     return a(☃, aga1, md1, i, w.a().getWorldVersion());
/*     */   }
/*     */   
/*     */   public static md a(DataFixer ☃, aga aga1, md md1, int i, int j) {
/* 466 */     return (md)☃.update(aga1.a(), new Dynamic(mo.a, md1), i, j).getValue();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\mp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */